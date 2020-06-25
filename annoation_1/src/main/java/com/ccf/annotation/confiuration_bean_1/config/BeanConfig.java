package com.ccf.annotation.confiuration_bean_1.config;

import com.ccf.annotation.confiuration_bean_1.entites.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenchaofan
 * 1: @Configuration:在类上使用该注解作用是声明该类是一个bean.xml文件
 * 2: @Bean:类似于<bean><bean/>标签
 */

@Configuration
public class BeanConfig {

    @Bean
    public Person person(){
        Person person = new Person();
        person.setName("lisi");
        return  person;
    }
}
