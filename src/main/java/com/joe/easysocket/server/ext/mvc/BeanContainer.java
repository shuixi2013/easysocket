package com.joe.easysocket.server.ext.mvc;

import com.joe.easysocket.server.common.Resource;

import java.lang.annotation.Annotation;
import java.util.Map;

/**
 * bean容器，需要可以扫描生成带有{@link com.joe.easysocket.server.ext.mvc.container.Provider}注解的bean
 * <p>
 * 如果使用系统自带的MVC容器，那么还需要bean容器可以扫描生成带有{@link com.joe.easysocket.server.ext.mvc.resource.annotation.Path}注解的bean
 * <p>
 * 实现的bean容器必须满足可以对构造函数的依赖自动注入，其他强制要求自动注入
 *
 * @author joe
 */
public interface BeanContainer extends Resource {
    /**
     * 从容器中获取带有指定注解的Bean
     *
     * @param annotationType 注解类型
     * @return 带有该注解的所有bean的map集合，其中map的key为bean的name，value为bean实例
     */
    Map<String, Object> getBeansWithAnnotation(Class<? extends Annotation> annotationType);
}
