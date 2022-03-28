package reflect;

import java.lang.annotation.*;

/**
 * @description:
 * @author: Evelyn
 * @date: 2022-03-28 21:26
 */
public class AnnotateTest {

    @MyAnnotation(name = "张三", hobby = {"吃饭","唱歌"}, age = 18)
    public void test(){

    }
}


@Documented // 生成document
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD}) //作用域范围
@Retention(RetentionPolicy.RUNTIME) //注解生效的阶段
@Inherited // 允许被子类继承
@interface MyAnnotation {

    // 注解的参数： 类型 参数名 （）
//    String name();
    // 默认为空，如果没有默认值，则会bacon
    String name() default "";
    int age() default 0;
    int id() default -1;
    String[] hobby();
}

