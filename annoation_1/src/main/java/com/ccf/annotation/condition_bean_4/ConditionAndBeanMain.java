package com.ccf.annotation.condition_bean_4;

import com.ccf.annotation.condition_bean_4.config.ConditionAndBeanConfig;
import com.ccf.annotation.condition_bean_4.entites.Car;
import com.ccf.annotation.condition_bean_4.entites.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author chenchaofan
 * @date 2020/6/25 - 14:56
 */
public class ConditionAndBeanMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx  = new AnnotationConfigApplicationContext(ConditionAndBeanConfig.class);
    }
}
