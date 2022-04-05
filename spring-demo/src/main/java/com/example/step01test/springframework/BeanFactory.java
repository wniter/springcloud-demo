package com.example.step01test.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @create 2022-01-29 1:47
 */
//创建简单的Spring Bean
public class BeanFactory {
    private Map<String, BeanDefinition> beanFactoryMap = new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return beanFactoryMap.get(name).getBean();
    }


    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanFactoryMap.put(name, beanDefinition);
    }
}
