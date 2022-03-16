package com.www.auto.load.spring.framework.config;

import com.www.auto.load.spring.framework.model.Red;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @description:
 * @author: Evelyn
 * @date: 2022-03-16 21:57
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
//@Import(Red.class) // 导入普通配置类,Red类将会被容器加载进来
//@Import(ColorImportSelector.class) // 导入ImportSelector类
//@Import(ColorRegistrarConfiguration.class) // 导入配置类
//@Import(ColorImportBeanDefinitionRegistrar.class) //导入BeanDefinitionRegistrar类
@Import({Red.class, ColorImportSelector.class, ColorImportBeanDefinitionRegistrar.class, ColorRegistrarConfiguration.class})
public @interface EnableColor {
}
