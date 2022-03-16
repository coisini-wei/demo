package com.www.hellospring.demo.java8.test;

import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: Evelyn
 * @date: 2021-10-14 21:56
 */
public class JavaTest {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("a", "b", "c", "A", "D");

        strings.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
    }






}
