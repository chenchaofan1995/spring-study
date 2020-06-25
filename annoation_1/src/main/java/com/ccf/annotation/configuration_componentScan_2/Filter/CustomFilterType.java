package com.ccf.annotation.configuration_componentScan_2.Filter;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * 自定义类型过滤器
 *
 * @author chenchaofan
 * @date 2020/6/23 - 16:56
 */
public class CustomFilterType implements TypeFilter {
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        //获取当前类的注解源信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();

        //获取当前类的class的源信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        //获取当前类的资源信息
        Resource resource =  metadataReader.getResource();
        System.out.println("类的路径:"+classMetadata.getClassName());
        if(classMetadata.getClassName().contains("Repository")) {
            return true;
        }
        return false;
    }
}
