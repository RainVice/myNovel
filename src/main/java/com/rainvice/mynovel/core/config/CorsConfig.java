package com.rainvice.mynovel.core.config;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @author : [Rainvice]
 * @version : [v1.0]
 * @className : CorsConfig
 * @description : [跨域配置]
 * @createTime : [2023/5/25 18:05]
 * @updateUser : [Rainvice]
 * @updateTime : [2023/5/25 18:05]
 * @updateRemark : [跨域配置]
 */

@Configuration
@EnableConfigurationProperties(CorsProperties.class)
@RequiredArgsConstructor
public class CorsConfig {

    private final CorsProperties corsProperties;

    @Bean
    public CorsFilter corsFilter(){
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        //添加允许的域名
        for (String allowOrigin : corsProperties.getAllowOrigins()) {
            corsConfiguration.addAllowedOrigin(allowOrigin);
        }
        // 允许的头信息
        corsConfiguration.addAllowedHeader("*");
        // 允许的请求方式
        corsConfiguration.addAllowedMethod("*");
        // 是否允许携带cookie
        corsConfiguration.setAllowCredentials(true);

        UrlBasedCorsConfigurationSource configurationSource = new UrlBasedCorsConfigurationSource();
        // 添加映射路径，拦截一切请求
        configurationSource.registerCorsConfiguration("/**",corsConfiguration);
        return new CorsFilter(configurationSource);
    }

}
