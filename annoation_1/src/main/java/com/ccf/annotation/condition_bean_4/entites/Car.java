package com.ccf.annotation.condition_bean_4.entites;

/**
 * @author chenchaofan
 * @date 2020/6/25 - 14:55
 */
public class Car {

    private String name;

    public Car() {
        System.out.println("car 初始化");
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
