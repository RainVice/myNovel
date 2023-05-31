package com.rainvice.mynovel.manager.cache;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.rainvice.mynovel.core.constant.CacheConsts;
import com.rainvice.mynovel.dao.entity.BookInfo;
import com.rainvice.mynovel.dao.entity.HomeBook;
import com.rainvice.mynovel.dao.mapper.BookMapper;
import com.rainvice.mynovel.dao.mapper.HomeBookMapper;
import com.rainvice.mynovel.dto.resp.HomeBookRespDto;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author : [Rainvice]
 * @version : [v1.0]
 * @className : HomeBookCacheManager
 * @description : [首页推荐小说 缓存管理类：将首页推荐数据库表home_book添加到redis中]
 * @createTime : [2023/5/25 20:24]
 * @updateUser : [Rainvice]
 * @updateTime : [2023/5/25 20:24]
 * @updateRemark : [描述说明本次修改内容]
 */

@Component
@RequiredArgsConstructor
public class HomeBookCacheManager {

    private final HomeBookMapper homeBookMapper;
    private final BookMapper bookMapper;

    /**
     * 查询首页小说推荐，并放入缓存中
     */
    @Cacheable(cacheManager = CacheConsts.CAFFEINE_CACHE_MANAGER
            , value = CacheConsts.HOME_BOOK_CACHE_NAME)
    public List<HomeBookRespDto> listHomeBooks() {
        // 从首页小说推荐表中查询出需要推荐的小说
        List<HomeBook> homeBooks = homeBookMapper.selectList(null);

        // 获取推荐小说ID列表
        if (!CollectionUtils.isEmpty(homeBooks)) {
            List<Long> bookIds = homeBooks.stream()
                    .map(HomeBook::getBookId)
                    .toList();

            // 根据小说ID列表查询相关的小说信息列表
            QueryWrapper<BookInfo> bookInfoQueryWrapper = new QueryWrapper<>();
            bookInfoQueryWrapper.in("id", bookIds);
            List<BookInfo> bookInfos = bookMapper.selectList(bookInfoQueryWrapper);

            // 组装 HomeBookRespDto 列表数据并返回
            if(!CollectionUtils.isEmpty(bookInfos)){
                Map<Long, BookInfo> bookInfoMap = bookInfos.stream()
                        .collect(Collectors.toMap(BookInfo::getId, Function.identity()));
                return homeBooks.stream().map(v -> {
                    BookInfo bookInfo = bookInfoMap.get(v.getBookId());
                    HomeBookRespDto bookRespDto = new HomeBookRespDto();
                    bookRespDto.setBookId(v.getBookId());
                    bookRespDto.setBookName(bookInfo.getBookName());
                    bookRespDto.setPicUrl(bookInfo.getPicUrl());
                    bookRespDto.setAuthorName(bookInfo.getAuthorName());
                    bookRespDto.setBookDesc(bookInfo.getBookDesc());
                    return bookRespDto;
                }).toList();

            }

        }

        return Collections.emptyList();
    }



}
