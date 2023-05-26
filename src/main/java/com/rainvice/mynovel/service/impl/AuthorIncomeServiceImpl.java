package com.rainvice.mynovel.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rainvice.mynovel.dao.entity.AuthorIncome;
import com.rainvice.mynovel.service.AuthorIncomeService;
import com.rainvice.mynovel.dao.mapper.AuthorIncomeMapper;
import org.springframework.stereotype.Service;

/**
* @author Rainvice
* @description 针对表【author_income(稿费收入统计)】的数据库操作Service实现
* @createDate 2023-05-25 21:41:48
*/
@Service
public class AuthorIncomeServiceImpl extends ServiceImpl<AuthorIncomeMapper, AuthorIncome>
    implements AuthorIncomeService{

}




