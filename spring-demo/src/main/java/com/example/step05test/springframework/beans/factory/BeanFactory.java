package com.example.step05test.springframework.beans.factory;

import com.example.step05test.springframework.beans.BeansException;

/**
 * 资源加载器解析文件注册对象
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;

    <T> T getBean(String name, Class<T> requiredType) throws BeansException;

}
