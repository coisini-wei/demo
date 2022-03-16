package com.www.auto.load.spring.framework.config;

import com.www.auto.load.spring.framework.model.Yellow;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: Evelyn
 * @date: 2022-03-16 22:27
 */
@Configuration
public class ColorRegistrarConfiguration {

    @Bean
    public Yellow createYellow() {
        return new Yellow();
    }
}
