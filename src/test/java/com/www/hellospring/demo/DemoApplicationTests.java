package com.www.hellospring.demo;

import com.www.hellospring.demo.bean.Person;
import com.www.hellospring.demo.service.HelloService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    Person person;

    @Autowired
    HelloService helloService;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void contextLoads() {
        boolean helloService = ioc.containsBean("helloService");
        System.out.println("是否包含helloService:  "+ helloService);
    }

    
    @Test
    public void logTest() {
        // 日志记录器
        Logger logger = LoggerFactory.getLogger(getClass());
        // 日志优先级别为： trace<debug<info<warn<error
        logger.trace("这是追踪日志...");
        logger.debug("这是调试日志，想对代码进行调试时，在关键位置输出的信息");
        logger.info("这是info日志，想输出在控制台的信息，有时候会输出一下重要信息，方便日志搜索，就用这个");
        logger.warn("这是警告日志，例如有时候出现异常，可以用这个");
        logger.error("这是错误日志，出现错误时，返回的信息");

    }


    @Test
    public void sumTest() {
        float sum = 0;
        for(int i = 0; i < 100 ; i ++) {
            sum += 0.1;
        }

        System.out.println(sum);

    }

}
