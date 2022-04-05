package com.example.step03test.springframework.beans.factory;

import com.example.step03test.springframework.beans.BeansException;

/**
 * 基于Cglib实现含构造函数的类实例化策略
 */

public interface BeanFactory {

    Object getBean(String name) throws BeansException;

    Object getBean(String name, Object... args) throws BeansException;

}
