package com.www.hellospring.demo;


import com.www.hellospring.demo.lambda.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LambdaTest {

    /**
     * 1、四大函数式即接口
     * Consumer<T> 消费型接口 ，有入参数，无返回值类型
     *
     * Predicate<T> 断言型接口 返回结果为true/false
     *
     * Function<T,R>  函数型接口
     *
     * Supplier<> 供给型接口，无入参，有返回
     *
     * 2、方法引用
     * 类::实例方法
     * 类::静态方法
     * 对象::实例方法
     *
     */

    /**
     * 1、消费型接口，将入参 打印输出
     */
    @Test
    public void test(){
        Consumer<String> con = (x) -> System.out.println(x);
        String str = "haha";
        con.accept(str);

        // 方法引用
        PrintStream p = System.out;
        Consumer<String> con1 =  p::println;
        con1.accept("love u");
    }

    /**
     * 2、 断言型接口 ,返回类型为 true /false
     */
    @Test
    public void test1() {
        // 入参为1个
        Predicate<Integer>  pre = (x) -> x>5;
        boolean test = pre.test(6);
        System.out.println("比较结果:" + test);

        // 入参为2个
        BiPredicate<String,String> bp = (x,y) -> x.equals(y);
        boolean test1 = bp.test("a", "b");
        System.out.println("test1:" + test1);

        // 使用方法引用
        BiPredicate<String,String> bp1 =  String::equals;
        boolean test2 = bp1.test("a", "a");
        System.out.println("test2:" + test2);

        Comparator<Integer> com = (x, y) -> Integer.compare(x,y);
        int compare = com.compare(5, 6);
        System.out.println(compare);

        Comparator<Integer> com1 = Integer::compare;
        com1.compare(1,5);
    }

    /**
     * 3、函数型接口，根据入参，返回指定类型
     */
    @Test
    public void test2(){
        Function<Integer, Student> fun = (x) -> new Student(x);
        Student student1 = fun.apply(5);
        System.out.println("student1:" + student1);

        Function<Integer,Student> fun1 = Student::new;
        Student apply = fun1.apply(6);
        System.out.println(apply);

        BiFunction<Integer, String, Student> biFunction = (x,y) -> new Student(x,y);
        BiFunction<Integer,String,Student> biFunction1 = Student::new;
        Student marry = biFunction.apply(3, "marry");
        Student tom = biFunction1.apply(6, "tom");
        System.out.println(marry);
        System.out.println(tom);
    }

    /**
     * 4、供给型接口
     */
    @Test
    public void test3() {
        Student student = new Student(3,"马丽");
        Supplier<String> sup = () -> student.getName();
        String s = sup.get();
        System.out.println(s);
    }
}
