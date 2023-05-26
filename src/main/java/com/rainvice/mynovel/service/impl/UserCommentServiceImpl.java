package com.rainvice.mynovel.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rainvice.mynovel.dao.entity.UserComment;
import com.rainvice.mynovel.service.UserCommentService;
import com.rainvice.mynovel.dao.mapper.UserCommentMapper;
import org.springframework.stereotype.Service;

/**
* @author Rainvice
* @description 针对表【user_comment(用户评论)】的数据库操作Service实现
* @createDate 2023-05-25 21:41:48
*/
@Service
public class UserCommentServiceImpl extends ServiceImpl<UserCommentMapper, UserComment>
    implements UserCommentService{

}




