package com.www.hellospring.demo.service;

public class Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        change(a,b);
        System.out.println("a="+ a);
        System.out.println("b="+ b);

    }
    private static void change (int a,int b) {
        b = a*b;
        a = a*a;
        System.out.println(a);


    }

}
