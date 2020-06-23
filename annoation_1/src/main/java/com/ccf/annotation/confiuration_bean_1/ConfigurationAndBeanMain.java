package com.ccf.annotation.confiuration_bean_1;

import com.ccf.annotation.confiuration_bean_1.config.BeanConfig;
import com.ccf.annotation.confiuration_bean_1.entites.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author chenchaofan
 * @date 2020/6/23 - 11:14
 */
public class ConfigurationAndBeanMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext =new AnnotationConfigApplicationContext(BeanConfig.class);
        Person person = (Person) annotationConfigApplicationContext.getBean("person");
        System.out.println(person);
    }
}
