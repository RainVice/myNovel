package com.rainvice.mynovel.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rainvice.mynovel.dao.entity.NewsInfo;
import com.rainvice.mynovel.service.NewsInfoService;
import com.rainvice.mynovel.dao.mapper.NewsInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author Rainvice
* @description 针对表【news_info(新闻信息)】的数据库操作Service实现
* @createDate 2023-05-25 21:41:48
*/
@Service
public class NewsInfoServiceImpl extends ServiceImpl<NewsInfoMapper, NewsInfo>
    implements NewsInfoService{

}




