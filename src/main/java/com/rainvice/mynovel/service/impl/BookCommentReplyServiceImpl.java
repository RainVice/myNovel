package com.rainvice.mynovel.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rainvice.mynovel.dao.entity.BookCommentReply;
import com.rainvice.mynovel.service.BookCommentReplyService;
import com.rainvice.mynovel.dao.mapper.BookCommentReplyMapper;
import org.springframework.stereotype.Service;

/**
* @author Rainvice
* @description 针对表【book_comment_reply(小说评论回复)】的数据库操作Service实现
* @createDate 2023-05-25 21:41:48
*/
@Service
public class BookCommentReplyServiceImpl extends ServiceImpl<BookCommentReplyMapper, BookCommentReply>
    implements BookCommentReplyService{

}




