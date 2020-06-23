package com.ccf.annotation.confiuration_bean_1.entites;

/**
 * Created by smlz on 2019/5/19.
 */

public class Person {

    private String name;
    public Person() {
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
