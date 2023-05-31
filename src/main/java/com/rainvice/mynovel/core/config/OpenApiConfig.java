package com.rainvice.mynovel.core.config;

import com.rainvice.mynovel.core.constant.SystemConfigConsts;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("dev")
@Configuration
@OpenAPIDefinition(info = @Info(title = "myNovel项目接口文档",version = "v0.0.1"))
@SecurityScheme(type = SecuritySchemeType.APIKEY,in = SecuritySchemeIn.HEADER,name = SystemConfigConsts.HTTP_AUTH_HEADER_NAME,description = "登录 token")
public class OpenApiConfig {
}
