package com.rainvice.mynovel.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rainvice.mynovel.dao.entity.BookComment;
import com.rainvice.mynovel.service.BookCommentService;
import com.rainvice.mynovel.dao.mapper.BookCommentMapper;
import org.springframework.stereotype.Service;

/**
* @author Rainvice
* @description 针对表【book_comment(小说评论)】的数据库操作Service实现
* @createDate 2023-05-25 21:41:48
*/
@Service
public class BookCommentServiceImpl extends ServiceImpl<BookCommentMapper, BookComment>
    implements BookCommentService{

}




