package com.rainvice.mynovel.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rainvice.mynovel.dao.entity.AuthorCode;
import com.rainvice.mynovel.service.AuthorCodeService;
import com.rainvice.mynovel.dao.mapper.AuthorCodeMapper;
import org.springframework.stereotype.Service;

/**
* @author Rainvice
* @description 针对表【author_code(作家邀请码)】的数据库操作Service实现
* @createDate 2023-05-25 21:41:48
*/
@Service
public class AuthorCodeServiceImpl extends ServiceImpl<AuthorCodeMapper, AuthorCode>
    implements AuthorCodeService{

}




