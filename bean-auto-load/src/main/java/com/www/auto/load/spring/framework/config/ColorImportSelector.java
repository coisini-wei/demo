package com.www.auto.load.spring.framework.config;

import com.www.auto.load.spring.framework.model.Blue;
import com.www.auto.load.spring.framework.model.Green;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @description:
 * @author: Evelyn
 * @date: 2022-03-16 22:17
 */
public class ColorImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[] {Blue.class.getName(), Green.class.getName()};
    }
}
