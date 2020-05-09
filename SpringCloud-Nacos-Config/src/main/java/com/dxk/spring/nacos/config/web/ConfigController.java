package com.dxk.spring.nacos.config.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: SpringCloud-Docker-K8s
 * @description: 配置中心测试
 * @author: 丁杏凯
 * @create: 2020-05-09 13:54
 **/
@RestController
@RefreshScope
public class ConfigController {
    @Value("${user.name}")
    private String name;
    @Value("${user.age}")
    private String age;

    @PostMapping(value = "config")
    public String config() {
        return "name: " + name + ", age: " + age;
    }
}
