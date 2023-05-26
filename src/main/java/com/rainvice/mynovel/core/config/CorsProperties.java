package com.rainvice.mynovel.core.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * @author : [Rainvice]
 * @version : [v1.0]
 * @className : CorsProperties
 * @description : [跨域配置属性]
 * @createTime : [2023/5/25 17:55]
 * @updateUser : [Rainvice]
 * @updateTime : [2023/5/25 17:55]
 * @updateRemark : [设置允许跨域的域名]
 */

@Configuration
@ConfigurationProperties(prefix = "novel.cors")
@Data
public class CorsProperties {

    /**
     * 允许跨域的域名
     * */
    private List<String> allowOrigins;
}

