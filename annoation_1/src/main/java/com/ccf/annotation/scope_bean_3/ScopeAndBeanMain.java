package com.ccf.annotation.scope_bean_3;

import com.ccf.annotation.scope_bean_3.config.ScopeAndBeanConfig;
import com.ccf.annotation.scope_bean_3.entities.Car;
import com.ccf.annotation.scope_bean_3.entities.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author chenchaofan
 * @date 2020/6/24 - 9:51
 */
public class ScopeAndBeanMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ScopeAndBeanConfig.class);
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }
        System.out.println("-----------------------");
        Person person = (Person)ctx.getBean("person");
        System.out.println(person);
        Person person2 = (Person)ctx.getBean("person");
        System.out.println("person:"+person.equals(person2));


        System.out.println("----------------------------");
        Car car= ctx.getBean(Car.class);
        Car car1 = ctx.getBean(Car.class);
        System.out.println("car:"+car.equals(car1));
    }
}
