package com.ccf.annotation.configuration_componentScan_2.config;

import com.ccf.annotation.configuration_componentScan_2.Filter.CustomFilterType;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * @author chenchaofan
 * ComponentScan是一个包扫描器对象，它的作用是将扫描的包、及下面所有子包的bean添加进容器里
 *  1：basePackages:指定扫描的包，将包下的bean添加进spring容器
 *  例如：@ComponentScan(basePackages ={"com.ccf.annotation.configuration_componentScan_2"} )
 *
 * 2: 将com.ccf.annotation.configuration_componentScan_2下的bean添加进容器，但是要排除该包下指定类型的bean
 *  使用注解过滤器：@ComponentScan.Filter(type = FilterType.ANNOTATION,value = {Controller.class})
 *  使用类类型过滤器：@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,value = {TestService.class})
 *  例如：@ComponentScan(basePackages = {"com.ccf.annotation.configuration_componentScan_2"},excludeFilters ={ @ComponentScan.Filter(type = FilterType.ANNOTATION,value = {Controller.class}),@ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,value = {TestService.class})})
 *
 * 3:将com.ccf.annotation.configuration_componentScan_2包下的bean添加进容器，但是只要满足规则的bean
 *  使用自定义规则过滤器：@ComponentScan.Filter(type = FilterType.CUSTOM,value = CustomFilterType.class)
 * 例如：@ComponentScan(basePackages = {"com.ccf.annotation.configuration_componentScan_2"},includeFilters = { @ComponentScan.Filter(type = FilterType.CUSTOM,value = CustomFilterType.class)},useDefaultFilters = false)
 *
 *
 * 4：注意：includeFilters 与excludeFilters 只能存在一个。
 */
@Configuration
//@ComponentScan(basePackages ={"com.ccf.annotation.configuration_componentScan_2"} )
//@ComponentScan(basePackages = {"com.ccf.annotation.configuration_componentScan_2"},excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = {Controller.class}), @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,value = {TestService.class})})
@ComponentScan(basePackages = {"com.ccf.annotation.configuration_componentScan_2"},includeFilters = {@ComponentScan.Filter(type = FilterType.CUSTOM,value = CustomFilterType.class)},useDefaultFilters = false)
public class ConfigurationAndComponentSacnConfig {
}
