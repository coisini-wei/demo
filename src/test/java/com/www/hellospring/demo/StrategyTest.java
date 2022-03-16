package com.www.hellospring.demo;

import com.www.hellospring.demo.strategy.Factory;
import com.www.hellospring.demo.strategy.Handler;
import org.junit.Test;

/**
 * @description:
 * @author: Evelyn
 * @date: 2020-10-12 23:08
 */
public class StrategyTest {

    private String name;

    @Test
    public void test() {
        String name = "张三";
        if(name.equals("张三")) {
            System.out.println("执行张三逻辑");
        }
        if(name.equals("李四")) {
            System.out.println("执行李四逻辑");
        }
        if(name.equals("王五")) {
            System.out.println("执行王五逻辑");
        }
    }

    @Test
    public void strategyTest() {
        String name = "张三";
        Handler handler = Factory.getInvokeStrategy(name);
        handler.getHobby(name);


    }
}
