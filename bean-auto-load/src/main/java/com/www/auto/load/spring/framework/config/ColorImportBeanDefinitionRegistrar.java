package com.www.auto.load.spring.framework.config;

import com.www.auto.load.spring.framework.model.Pink;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @description:
 * @author: Evelyn
 * @date: 2022-03-16 22:35
 */
public class ColorImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        registry.registerBeanDefinition("newPink", new RootBeanDefinition(Pink.class));
    }
}
