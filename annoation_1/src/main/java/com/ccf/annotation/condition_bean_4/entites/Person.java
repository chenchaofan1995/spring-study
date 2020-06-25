package com.ccf.annotation.condition_bean_4.entites;

/**
 * @author chenchaofan
 * @date 2020/6/25 - 14:55
 */
public class Person {

    private String name;

    public Person() {
        System.out.println("person 初始化");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
