package com.www.hellospring.demo.config;

import com.www.hellospring.demo.component.LoginHandlerInterceptor;
import com.www.hellospring.demo.component.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

// WebMvcConfigurerAdapter 实现springmvc的扩展配置
@Configuration
//@EnableWebMvc 不要使用该配置，因为该配置一使用SpringBoot的默认配置就不生效了
public class MyMvcConfigure extends WebMvcConfigurerAdapter {

    // 设置请求访问路径为home的时候，系统访问success页面
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        // addViewController 设置要添加的请求。 setViewName，设置请求访问的路径
        registry.addViewController("home").setViewName("success");

    }


    // 使用 WebMvcConfigurerAdapter的话，所有的组建会一起 起作用，
    // @Bean注解，告诉容器返回类型
    @Bean
    public WebMvcConfigurerAdapter webMvcConfigurerAdapter() {
        WebMvcConfigurerAdapter adapter = new WebMvcConfigurerAdapter() {

            // 添加登陆拦截起
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
//                super.addInterceptors(registry);
                registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
                        .excludePathPatterns("/", "/index.html", "/userLogin");
                int i = 3;
            }

            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/index.html").setViewName("login");
                registry.addViewController("/main.html").setViewName("dashboard");
            }


        };
        return adapter;
    }

    @Bean //使用该注解，才会将对象返还给容器
    public LocaleResolver localeResolver() {
        return new MyLocaleResolver();
    }


}
