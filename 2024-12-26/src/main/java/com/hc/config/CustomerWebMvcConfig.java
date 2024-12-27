package com.hc.config;

import com.hc.interceptor.CustomerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
*@description 自定义webMvc配置类
*@author hc
*@date 2024/12/24  10:03
*/
@Configuration
public class CustomerWebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //拦截所有请求
        registry.addInterceptor(new CustomerInterceptor()).addPathPatterns("/api/**");
    }
}
