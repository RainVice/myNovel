package com.rainvice.mynovel.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rainvice.mynovel.dao.entity.BookInfo;
import com.rainvice.mynovel.service.BookInfoService;
import com.rainvice.mynovel.dao.mapper.BookInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author Rainvice
* @description 针对表【book_info(小说信息)】的数据库操作Service实现
* @createDate 2023-05-25 20:26:23
*/
@Service
public class BookInfoServiceImpl extends ServiceImpl<BookInfoMapper, BookInfo>
    implements BookInfoService{

}




