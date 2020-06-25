package com.ccf.annotation.scope_bean_3.entities;

/**
 * @author chenchaofan
 * @date 2020/6/24 - 9:42
 */
public class Person {

    private String name;

    public Person() {
        System.out.println("懒加载");
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
