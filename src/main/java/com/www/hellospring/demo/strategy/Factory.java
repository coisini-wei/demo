package com.www.hellospring.demo.strategy;


import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @description: 工厂模式
 * @author: Evelyn
 * @date: 2020-10-15 21:44
 */
public class Factory   {
    private static Map<String,Handler> strategyMap = Maps.newHashMap();

    public static Handler getInvokeStrategy(String name) {
        return strategyMap.get(name);
    }

    public static void registory(String name, Handler handler) {
        strategyMap.put(name,handler);
    }

}
