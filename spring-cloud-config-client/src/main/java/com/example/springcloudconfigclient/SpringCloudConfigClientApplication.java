package com.example.springcloudconfigclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.bootstrap.config.PropertySourceLocator;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.PropertySource;

import java.util.logging.Logger;
import java.util.*;

@SpringBootApplication
public class SpringCloudConfigClientApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringCloudConfigClientApplication.class, args);

    }
    @Configuration
    @Order(Ordered.HIGHEST_PRECEDENCE)
    public static class MyPropertySourceLocate implements PropertySourceLocator {
        @Override
        public PropertySource<?> locate(Environment environment) {
            Map<String ,Object> source = new HashMap<>();
            source.put("server.port","8080");
            MapPropertySource propertySource =
                    new MapPropertySource("my-property-source",source);
            return propertySource;
        }
    }

}
