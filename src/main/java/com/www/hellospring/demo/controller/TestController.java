package com.www.hellospring.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Evelyn
 * @date: 2021-06-06 18:42
 */
@RestController
public class TestController {

    @GetMapping("/testHa")
    public void test() {
        System.out.println("==========haha==========");

    }
}
