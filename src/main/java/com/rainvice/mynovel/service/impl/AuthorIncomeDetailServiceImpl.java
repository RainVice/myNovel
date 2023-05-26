package com.rainvice.mynovel.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rainvice.mynovel.dao.entity.AuthorIncomeDetail;
import com.rainvice.mynovel.service.AuthorIncomeDetailService;
import com.rainvice.mynovel.dao.mapper.AuthorIncomeDetailMapper;
import org.springframework.stereotype.Service;

/**
* @author Rainvice
* @description 针对表【author_income_detail(稿费收入明细统计)】的数据库操作Service实现
* @createDate 2023-05-25 21:41:48
*/
@Service
public class AuthorIncomeDetailServiceImpl extends ServiceImpl<AuthorIncomeDetailMapper, AuthorIncomeDetail>
    implements AuthorIncomeDetailService{

}




