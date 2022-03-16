package com.www.hellospring.demo.config;

import com.www.hellospring.demo.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration注解标明该类为配置类
 */
@Configuration
public class MyApplicationConfig {

    /**
     * @Bean用来标志配置方法，将方法的返回值配置给容器
     * @return
     */
    @Bean
    public HelloService getHelloService() {

        return new HelloService();
    }


}
