package com.www.auto.load.spring.framework;

import com.www.auto.load.spring.framework.config.ColorConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

/**
 * @description:
 * @author: Evelyn
 * @date: 2022-03-16 22:11
 */
public class SpringFrameworkBeanLoadTestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ColorConfiguration.class);
        String[] beans = context.getBeanDefinitionNames();
        Stream.of(beans).forEach(System.out::println);
    }
}
