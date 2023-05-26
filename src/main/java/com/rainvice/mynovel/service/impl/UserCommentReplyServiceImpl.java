package com.rainvice.mynovel.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rainvice.mynovel.dao.entity.UserCommentReply;
import com.rainvice.mynovel.service.UserCommentReplyService;
import com.rainvice.mynovel.dao.mapper.UserCommentReplyMapper;
import org.springframework.stereotype.Service;

/**
* @author Rainvice
* @description 针对表【user_comment_reply(用户评论回复)】的数据库操作Service实现
* @createDate 2023-05-25 21:41:48
*/
@Service
public class UserCommentReplyServiceImpl extends ServiceImpl<UserCommentReplyMapper, UserCommentReply>
    implements UserCommentReplyService{

}




