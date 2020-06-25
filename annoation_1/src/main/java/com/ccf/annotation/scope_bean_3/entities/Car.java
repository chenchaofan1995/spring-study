package com.ccf.annotation.scope_bean_3.entities;

/**
 * @author chenchaofan
 * @date 2020/6/24 - 9:42
 */
public class Car {

    private String name;

    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}
