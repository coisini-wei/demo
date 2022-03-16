package com.www.hellospring.demo;

import com.www.hellospring.demo.strategy.Factory;
import com.www.hellospring.demo.strategy.Handler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ImportResource 是导入自己所写的spring配置文件，使配置生效
 */
@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
@ComponentScan("com.www")
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		SpringApplication.run(DemoApplication.class, args);
		String name = "张三";
		Handler handler = Factory.getInvokeStrategy(name);
		handler.getHobby(name);

	}
}
