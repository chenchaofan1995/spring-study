package com.ccf.annotation.scope_bean_3.config;

import com.ccf.annotation.scope_bean_3.entities.Car;
import com.ccf.annotation.scope_bean_3.entities.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

/**
 * @author chenchaofan
 * @date 2020/6/24 - 9:52
 */
@Configuration
public class ScopeAndBeanConfig {

    /**
     * 1：@Lazy:懒加载，系统启动的时候不创建bean,而是在第一次获取的时候创建这个bean.
     */
    @Bean
    @Lazy
    public Person person(){
        Person person = new Person();
        person.setName("lisi");
        return person;
    }

    /**
     * 1:@Scope value= prototype是一个多列，每次获取的时候都是不同的对象。多实例对象是不交spring容器管理的。
     * value = singleton 单列（默认值）
     */
    @Bean
    @Scope(value = "prototype")
    public Car car (){
        Car car =new Car();
        car.setName("汽车");
        return car;
    }
}
