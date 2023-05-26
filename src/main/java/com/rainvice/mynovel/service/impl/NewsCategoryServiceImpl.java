package com.rainvice.mynovel.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rainvice.mynovel.dao.entity.NewsCategory;
import com.rainvice.mynovel.service.NewsCategoryService;
import com.rainvice.mynovel.dao.mapper.NewsCategoryMapper;
import org.springframework.stereotype.Service;

/**
* @author Rainvice
* @description 针对表【news_category(新闻类别)】的数据库操作Service实现
* @createDate 2023-05-25 21:41:48
*/
@Service
public class NewsCategoryServiceImpl extends ServiceImpl<NewsCategoryMapper, NewsCategory>
    implements NewsCategoryService{

}




