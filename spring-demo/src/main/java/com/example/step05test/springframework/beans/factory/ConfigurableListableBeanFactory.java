package com.example.step05test.springframework.beans.factory;

import com.example.step05test.springframework.beans.BeansException;
import com.example.step05test.springframework.beans.factory.config.AutowireCapableBeanFactory;
import com.example.step05test.springframework.beans.factory.config.BeanDefinition;
import com.example.step05test.springframework.beans.factory.config.ConfigurableBeanFactory;

/**
 * Configuration interface to be implemented by most listable bean factories.
 * In addition to {@link ConfigurableBeanFactory}, it provides facilities to
 * analyze and modify bean definitions, and to pre-instantiate singletons.
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

}
