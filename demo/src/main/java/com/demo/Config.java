package com.demo;

import com.demo.intercept.LoginIntercept;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class Config implements WebMvcConfigurer {
    private LoginIntercept loginIntercept;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
   registry.addInterceptor(loginIntercept).addPathPatterns("/**").excludePathPatterns("/login");
    }
}
