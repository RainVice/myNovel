package com.rainvice.mynovel.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rainvice.mynovel.dao.entity.BookChapter;
import com.rainvice.mynovel.service.BookChapterService;
import com.rainvice.mynovel.dao.mapper.BookChapterMapper;
import org.springframework.stereotype.Service;

/**
* @author Rainvice
* @description 针对表【book_chapter(小说章节)】的数据库操作Service实现
* @createDate 2023-05-25 21:41:48
*/
@Service
public class BookChapterServiceImpl extends ServiceImpl<BookChapterMapper, BookChapter>
    implements BookChapterService{

}




