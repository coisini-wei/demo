package com.www.hellospring.demo.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author evelyn0322
 * @Description
 * @Date 2020/2/2 1:08 下午
 */
// 这个组件，只有是容器的组件，才能使用容器提供的configurationProperties功能
 // PropertySource 该注解用来指定要引用的.properties文件
@PropertySource(value={"classpath:person.properties"})
@Component
//通过前缀 和配置文件中的对象 相匹配
@ConfigurationProperties(prefix = "person") //该注解默认从全局配置中加载配置
//@Validated 规则校验的注解
public class Person {
    /*
        相当于原始的xml属性配置
        <bean class="Person">
            <properties name="lastName" value="字面量/${从配置文件、环境变量中获取的值}/#{SpEL}">
        </bean>
     */
    //@Value("花花")
    private String lastName;

    //@Value("#{5*7}") //获取SpEL表达式的值
    private Integer age;

    //@Email 校验email个数
    //@Value("${person.boss}") //从配置文件中获取
    private boolean boss;
    private Date birth;

    // map 类型的值，不能通过@Value注解，从配置文件中获取
    private Map<Object,Object> maps;

    // List 类型的值，不能通过@Value注解，从配置文件中获取
    private List<Object> lists;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isBoss() {
        return boss;
    }

    public void setBoss(boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<Object, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<Object, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lists=" + lists +
                '}';
    }
}
