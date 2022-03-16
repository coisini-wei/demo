package com.www.hellospring.demo.controller;

import com.www.hellospring.demo.bean.Person;
import com.www.hellospring.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author evelyn0322
 * @Description
 * @Date 2020/2/1 1:31 下午
 */
@Controller
public class HelloWorld {
    @Autowired
    Person person;

    @Autowired
    HelloService helloService;

    @Autowired
    ApplicationContext ioc;

    @ResponseBody
    @RequestMapping("/hello")
    public Person hello() {
        System.out.println("----------------------hah-------------------");
        System.out.println(person);
        return person;
    }

    @ResponseBody
    @RequestMapping("/getHelloService")
    public boolean getHelloService() {
        boolean hello= ioc.containsBean("helloService");
        System.out.println("是否包含helloService " + hello);
        return hello;
    }

    @RequestMapping("/his")
    public String getSuccess(Map<String,Object> map) {
        System.out.println("hhhhhhhhh");
        map.put("name","mary");
        // 会从classpath/templates 下寻找 success.html
        return "haha";
    }

    private String getM(){
        return "";
    }

    public void getM(String a){
         
    }



//    @RequestMapping({"index","/"})
//    public String getHome() {
//        return "index";
//    }
}
