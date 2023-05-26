package com.rainvice.mynovel.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rainvice.mynovel.dao.entity.PayWechat;
import com.rainvice.mynovel.service.PayWechatService;
import com.rainvice.mynovel.dao.mapper.PayWechatMapper;
import org.springframework.stereotype.Service;

/**
* @author Rainvice
* @description 针对表【pay_wechat(微信支付)】的数据库操作Service实现
* @createDate 2023-05-25 21:41:48
*/
@Service
public class PayWechatServiceImpl extends ServiceImpl<PayWechatMapper, PayWechat>
    implements PayWechatService{

}




