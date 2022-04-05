package com.example.step01test.springframework;

/**
 * @create 2022-01-29 1:48
 */
public class BeanDefinition {
    //bean定义
    private Object bean;


    public Object getBean() {
        return bean;
    }

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }
}
