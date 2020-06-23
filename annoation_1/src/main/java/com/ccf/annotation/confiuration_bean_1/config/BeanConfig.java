package com.ccf.annoation.confiuration_bean_1.config;

import com.ccf.annoation.confiuration_bean_1.entites.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenchaofan
 * @date 2020/6/23 - 11:17
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
