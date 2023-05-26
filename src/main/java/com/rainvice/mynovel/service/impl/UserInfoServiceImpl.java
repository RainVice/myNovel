package com.rainvice.mynovel.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rainvice.mynovel.dao.entity.UserInfo;
import com.rainvice.mynovel.service.UserInfoService;
import com.rainvice.mynovel.dao.mapper.UserInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author Rainvice
* @description 针对表【user_info(用户信息)】的数据库操作Service实现
* @createDate 2023-05-25 21:41:48
*/
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo>
    implements UserInfoService{

}




