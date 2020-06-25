package com.ccf.annotation.condition_bean_4.condition;

import com.ccf.annotation.condition_bean_4.entites.Person;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author chenchaofan
 * @date 2020/6/25 - 15:03
 */
public class PersonCondition implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Person bean = conditionContext.getBeanFactory().getBean(Person.class);
        return bean == null;
    }
}
