package com.rainvice.mynovel.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rainvice.mynovel.dao.entity.BookCategory;
import com.rainvice.mynovel.service.BookCategoryService;
import com.rainvice.mynovel.dao.mapper.BookCategoryMapper;
import org.springframework.stereotype.Service;

/**
* @author Rainvice
* @description 针对表【book_category(小说类别)】的数据库操作Service实现
* @createDate 2023-05-25 21:41:48
*/
@Service
public class BookCategoryServiceImpl extends ServiceImpl<BookCategoryMapper, BookCategory>
    implements BookCategoryService{

}




