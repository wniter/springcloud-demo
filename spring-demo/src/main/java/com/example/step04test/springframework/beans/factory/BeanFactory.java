package com.example.step04test.springframework.beans.factory;

import com.example.step04test.springframework.beans.BeansException;

/**
 * 注入属性和依赖对象
 */
public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;

}
