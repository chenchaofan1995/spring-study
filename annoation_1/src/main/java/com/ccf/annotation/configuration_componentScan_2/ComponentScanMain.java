package com.ccf.annotation.configuration_componentScan_2;

import com.ccf.annotation.configuration_componentScan_2.config.ConfigurationAndComponentSacnConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author chenchaofan
 * @date 2020/6/23 - 15:33
 */
public class ComponentScanMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigurationAndComponentSacnConfig.class);
        String[] beanNames = ctx.getBeanDefinitionNames();
        for (int i = 0; i < beanNames.length; i++) {
            System.out.println(beanNames[i]);
        }

    }
}
