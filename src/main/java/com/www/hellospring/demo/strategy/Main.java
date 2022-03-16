package com.www.hellospring.demo.strategy;

import com.www.hellospring.demo.controller.HelloWorld;

/**
 * @description:
 * @author: Evelyn
 * @date: 2020-10-15 22:30
 */
public class Main {
    public static void main(String[] args) {
        String name = "张三";
        Handler invokeStrategy = Factory.getInvokeStrategy(name);
        invokeStrategy.getHobby(name);
    }
}
