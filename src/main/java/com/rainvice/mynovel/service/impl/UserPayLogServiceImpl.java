package com.rainvice.mynovel.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rainvice.mynovel.dao.entity.UserPayLog;
import com.rainvice.mynovel.service.UserPayLogService;
import com.rainvice.mynovel.dao.mapper.UserPayLogMapper;
import org.springframework.stereotype.Service;

/**
* @author Rainvice
* @description 针对表【user_pay_log(用户充值记录)】的数据库操作Service实现
* @createDate 2023-05-25 21:41:48
*/
@Service
public class UserPayLogServiceImpl extends ServiceImpl<UserPayLogMapper, UserPayLog>
    implements UserPayLogService{

}




