package com.rainvice.mynovel.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rainvice.mynovel.dao.entity.UserConsumeLog;
import com.rainvice.mynovel.service.UserConsumeLogService;
import com.rainvice.mynovel.dao.mapper.UserConsumeLogMapper;
import org.springframework.stereotype.Service;

/**
* @author Rainvice
* @description 针对表【user_consume_log(用户消费记录)】的数据库操作Service实现
* @createDate 2023-05-25 21:41:48
*/
@Service
public class UserConsumeLogServiceImpl extends ServiceImpl<UserConsumeLogMapper, UserConsumeLog>
    implements UserConsumeLogService{

}




