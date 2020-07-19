package com.igeek.rs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyConfig {
    @Bean
    public WebMvcConfigurer webMvcConfigurer(){

        WebMvcConfigurer configurer = new WebMvcConfigurer(){
            //添加视图解析器
            public void addViewControllers(ViewControllerRegistry registry){
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/a").setViewName("adminLogin");
                registry.addViewController("/index").setViewName("login");
            }

//            //添加拦截器  addPathPatterns 添加拦截路径,/**代表拦截所有资源  excludePathPatterns 排除拦截哪些路径
//            @Override
//            public void addInterceptors(InterceptorRegistry registry) {
//                registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns("/","/index.html","/u/login","/css/**","/js/**","/img/**","/webjars/**");
//            }
        };




        return configurer;
    }


}
