package com.example.springcloudconfigclient.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @create 2022-02-28 7:24
 */
@RestController
public class EchoEnvController {
    private Environment environment;

    @Value("8080")
    private Integer port;

    @Autowired
    public EchoEnvController(Environment environment) {
        this.environment = environment;
    }
    @GetMapping("/echo/env/{name}")
    public Map<String, String> enviroment(@PathVariable String name) {
        Map<String,String> data = new HashMap<>();
        data.put(name,environment.getProperty(name));
        return data;
    }
}
