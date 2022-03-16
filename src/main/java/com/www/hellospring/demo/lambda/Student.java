package com.www.hellospring.demo.lambda;

public class Student {
    private Integer age;

    private String name;

    private double score;

    public Student(Integer age, String name, double score) {
        this.age = age;
        this.name = name;
        this.score = score;
    }

    public Student(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student() {
    }

    public Student(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
