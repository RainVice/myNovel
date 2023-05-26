package com.rainvice.mynovel.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rainvice.mynovel.dao.entity.UserReadHistory;
import com.rainvice.mynovel.service.UserReadHistoryService;
import com.rainvice.mynovel.dao.mapper.UserReadHistoryMapper;
import org.springframework.stereotype.Service;

/**
* @author Rainvice
* @description 针对表【user_read_history(用户阅读历史)】的数据库操作Service实现
* @createDate 2023-05-25 21:41:48
*/
@Service
public class UserReadHistoryServiceImpl extends ServiceImpl<UserReadHistoryMapper, UserReadHistory>
    implements UserReadHistoryService{

}




