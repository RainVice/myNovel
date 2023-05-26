package com.rainvice.mynovel.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rainvice.mynovel.dao.entity.AuthorInfo;
import com.rainvice.mynovel.service.AuthorInfoService;
import com.rainvice.mynovel.dao.mapper.AuthorInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author Rainvice
* @description 针对表【author_info(作者信息)】的数据库操作Service实现
* @createDate 2023-05-25 21:41:48
*/
@Service
public class AuthorInfoServiceImpl extends ServiceImpl<AuthorInfoMapper, AuthorInfo>
    implements AuthorInfoService{

}




