package com.rainvice.mynovel.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rainvice.mynovel.dao.entity.BookContent;
import com.rainvice.mynovel.service.BookContentService;
import com.rainvice.mynovel.dao.mapper.BookContentMapper;
import org.springframework.stereotype.Service;

/**
* @author Rainvice
* @description 针对表【book_content(小说内容)】的数据库操作Service实现
* @createDate 2023-05-25 21:41:48
*/
@Service
public class BookContentServiceImpl extends ServiceImpl<BookContentMapper, BookContent>
    implements BookContentService{

}




