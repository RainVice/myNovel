package com.rainvice.mynovel.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rainvice.mynovel.dao.entity.Test;
import com.rainvice.mynovel.service.TestService;
import com.rainvice.mynovel.dao.mapper.TestMapper;
import org.springframework.stereotype.Service;

/**
* @author Rainvice
* @description 针对表【test】的数据库操作Service实现
* @createDate 2023-05-25 21:41:48
*/
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test>
    implements TestService{

}




