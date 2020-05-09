package com.dxk.spring.nacos.provider.web;

import org.springframework.beans.factory.annotation.Value;
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
    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "hello")
    public String echo(@RequestParam(name = "name") String name) {
        String msg = "hello, " + name +" 您好, 端口：" + serverPort + " 正在为您服务~~";
        System.out.println(msg);
        return msg;
    }
}
