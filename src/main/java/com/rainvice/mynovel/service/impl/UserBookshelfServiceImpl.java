package com.rainvice.mynovel.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rainvice.mynovel.dao.entity.UserBookshelf;
import com.rainvice.mynovel.service.UserBookshelfService;
import com.rainvice.mynovel.dao.mapper.UserBookshelfMapper;
import org.springframework.stereotype.Service;

/**
* @author Rainvice
* @description 针对表【user_bookshelf(用户书架)】的数据库操作Service实现
* @createDate 2023-05-25 21:41:48
*/
@Service
public class UserBookshelfServiceImpl extends ServiceImpl<UserBookshelfMapper, UserBookshelf>
    implements UserBookshelfService{

}




