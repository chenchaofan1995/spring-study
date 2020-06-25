package com.ccf.annotation.condition_bean_4.config;

import com.ccf.annotation.condition_bean_4.condition.PersonCondition;
import com.ccf.annotation.condition_bean_4.entites.Car;
import com.ccf.annotation.condition_bean_4.entites.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenchaofan
 * @date 2020/6/25 - 14:57
 */
@Configuration
public class ConditionAndBeanConfig {

    @Bean
    public Person person(){
        Person person = new Person();
        person.setName("lisi");
        return person;
    }

    /**
     * 根据条件来判断是否需要创建car对象。
     * 如果PersonCondition的match方法返回true,创建car对象，否则不创建。
     *
     */
    @Bean
    @Conditional({PersonCondition.class})
    public Car car(){
        Car car = new Car();
        car.setName("汽车");
        return car;
    }
}
