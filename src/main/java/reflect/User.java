package reflect;

import java.lang.annotation.Documented;

/**
 * @description:
 * @author: Evelyn
 * @date: 2022-03-28 22:13
 */
public class User {
    private String name;
    private int age;
    private String hobby;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public User(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public User() {
    }




}
