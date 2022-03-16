package com.www.hellospring.demo.strategy;

import org.springframework.beans.factory.InitializingBean;

/**
 * @description:
 * @author: Evelyn
 * @date: 2020-10-12 23:14
 */
public interface Handler extends InitializingBean {

     void getHobby(String name);
}
