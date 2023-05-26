package com.rainvice.mynovel.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rainvice.mynovel.dao.entity.SysUser;
import com.rainvice.mynovel.service.SysUserService;
import com.rainvice.mynovel.dao.mapper.SysUserMapper;
import org.springframework.stereotype.Service;

/**
* @author Rainvice
* @description 针对表【sys_user(系统用户)】的数据库操作Service实现
* @createDate 2023-05-25 19:01:47
*/
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser>
    implements SysUserService{

}




