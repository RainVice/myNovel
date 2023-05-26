package com.rainvice.mynovel.dao.mapper;

import com.rainvice.mynovel.dao.entity.HomeBook;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

/**
* @author Rainvice
* @description 针对表【home_book(小说推荐)】的数据库操作Mapper
* @createDate 2023-05-25 21:41:48
* @Entity com.rainvice.mynovel.dao.entity.HomeBook
*/
public interface HomeBookMapper extends BaseMapper<HomeBook> {

}




