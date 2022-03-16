package com.www.hellospring.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StreamTest {
    /**
     * 生成Stream的四种的方式
     * 1、通过集合的stream
     * 2、通过数组
     * 3、通过Stream的静态方法of
     * 4、生成无限流
     *  1）、通过iterate迭代
     *  2）、通过generate
     */


    @Test
    public void test1() {
        // 通过集合的stream
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        Stream<Integer> stream = list.stream();
        stream.forEach(System.out::println);
    }

    @Test
    public void test2() {
        // 通过数组的stream
        String strArray[] = {"hello","world"};
        Stream<String> stream = Arrays.stream(strArray);
        stream.forEach(System.out::println);
    }


    @Test
    public void test3() {
        // 通过Stream的静态方法
        String arr[] = {"heihei","angle"};
        Stream<Object> stream = Stream.of(arr);
        stream.forEach(System.out::println);
    }

    @Test
    public void test4() {
        // 生成无限流
        // 1、通过iterator迭代
        Stream stream = Stream.iterate(0, x -> x+2);
        stream.forEach(System.out::println);

        // 2、for
        Stream<Double> stream1 = Stream.generate(() -> Math.random() * 10);
        stream1.limit(10).forEach(System.out::println);
    }
}
