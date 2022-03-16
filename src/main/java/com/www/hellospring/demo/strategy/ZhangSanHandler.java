package com.www.hellospring.demo.strategy;

import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: Evelyn
 * @date: 2020-10-12 23:17
 */
@Component
public class ZhangSanHandler implements Handler {
    @Override
    public void getHobby(String name) {
        System.out.println("获取张三喜好");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Factory.registory("张三",this);
    }


}
