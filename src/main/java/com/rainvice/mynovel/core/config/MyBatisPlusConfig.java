package com.rainvice.mynovel.core.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : [Rainvice]
 * @version : [v1.0]
 * @className : MyBatisPlusConfig
 * @description : [MyBatisPlus配置类]
 * @createTime : [2023/5/25 18:30]
 * @updateUser : [Rainvice]
 * @updateTime : [2023/5/25 18:30]
 * @updateRemark : [描述说明本次修改内容]
 */

@Configuration
public class MyBatisPlusConfig {


    /**
     * 分页插件
     * @return
     */
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();
        mybatisPlusInterceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        return mybatisPlusInterceptor;
    }

}
