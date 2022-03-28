package reflect;

import java.util.stream.Stream;

/**
 * @description:
 * @author: Evelyn
 * @date: 2022-03-28 22:15
 */
public class ReflectMainTest {
    public static void main(String[] args) {
        try {
            Class aClass = reflectClass("reflect.User");
            System.out.println(aClass.getClass());

            System.out.println("----------------------------");
            System.out.println("---获取所有构造器---");
            Stream.of(aClass.getConstructors()).forEach(System.out::println);
            System.out.println("---获取所有构造器结束---");

            System.out.println("获取父类" + aClass.getSuperclass());

            System.out.println("----------------------------");
            System.out.println("---获取所有的方法开始--");
            Stream.of(aClass.getMethods()).forEach(System.out::println);
            System.out.println("---获取所有的方法结束--");

            System.out.println("----------------------------");
            System.out.println("获取已经声明的注解" + aClass.getDeclaredAnnotations());

            System.out.println("----------------------------");
            System.out.println("获取类加载器" + aClass.getClassLoader());
            System.out.println(aClass.getClassLoader());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    static Class reflectClass(String fullName) throws ClassNotFoundException {
        Class<?> aClass = Class.forName(fullName);
        return aClass;
    }
}
