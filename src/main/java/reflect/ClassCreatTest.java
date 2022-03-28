package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @description:
 * @author: Evelyn
 * @date: 2022-03-28 22:39
 */
public class ClassCreatTest {

    public static void main(String[] args) {
        try {
            Person person = new Student();
            System.out.println(person);
            Class<? extends Person> personClass = person.getClass();
            String name = personClass.getName();
            Constructor<?>[] constructors = personClass.getConstructors();
            Method[] methods = personClass.getMethods();
            Class<?> superclass = personClass.getSuperclass();
            Field[] declaredFields = personClass.getDeclaredFields();
            Field[] declaredFields1 = personClass.getSuperclass().getDeclaredFields();
            System.out.println("hha");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}

class Student extends Person {
    String hobby;

    public Student(String name, String age, String hobby) {
        super(name, age);
        this.hobby = hobby;
    }


    public Student(String hobby) {
        this.hobby = hobby;
    }

    public Student() {

    }
}

class Person {
    String name;

    String age;

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

    }
}
