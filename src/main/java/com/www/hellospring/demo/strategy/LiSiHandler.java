package com.www.hellospring.demo.strategy;

import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: Evelyn
 * @date: 2020-10-12 23:18
 */
@Component
public class LiSiHandler implements Handler {
    @Override
    public void getHobby(String name) {
        System.out.println("获取到李四喜好");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Factory.registory("李四",this);
    }
}
