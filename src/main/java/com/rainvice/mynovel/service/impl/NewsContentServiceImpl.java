package com.rainvice.mynovel.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rainvice.mynovel.dao.entity.NewsContent;
import com.rainvice.mynovel.service.NewsContentService;
import com.rainvice.mynovel.dao.mapper.NewsContentMapper;
import org.springframework.stereotype.Service;

/**
* @author Rainvice
* @description 针对表【news_content(新闻内容)】的数据库操作Service实现
* @createDate 2023-05-25 21:41:48
*/
@Service
public class NewsContentServiceImpl extends ServiceImpl<NewsContentMapper, NewsContent>
    implements NewsContentService{

}




