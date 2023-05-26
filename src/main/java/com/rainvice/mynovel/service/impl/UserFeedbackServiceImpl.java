package com.rainvice.mynovel.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rainvice.mynovel.dao.entity.UserFeedback;
import com.rainvice.mynovel.service.UserFeedbackService;
import com.rainvice.mynovel.dao.mapper.UserFeedbackMapper;
import org.springframework.stereotype.Service;

/**
* @author Rainvice
* @description 针对表【user_feedback(用户反馈)】的数据库操作Service实现
* @createDate 2023-05-25 21:41:48
*/
@Service
public class UserFeedbackServiceImpl extends ServiceImpl<UserFeedbackMapper, UserFeedback>
    implements UserFeedbackService{

}




