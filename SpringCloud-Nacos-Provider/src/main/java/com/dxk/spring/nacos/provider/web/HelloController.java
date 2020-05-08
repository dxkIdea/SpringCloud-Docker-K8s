package com.dxk.spring.nacos.provider.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: SpringCloud-Docker-K8s
 * @description: 测试类
 * @author: 丁杏凯
 * @create: 2020-05-08 22:43
 **/
@RestController
public class HelloController {
    @PostMapping(value = "hello")
    public String echo(@RequestParam(name = "name") String name) {
        return "hello, " + name +" 您好";
    }
}
