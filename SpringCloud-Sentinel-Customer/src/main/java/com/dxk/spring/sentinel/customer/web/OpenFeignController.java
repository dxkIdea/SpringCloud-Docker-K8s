package com.dxk.spring.sentinel.customer.web;

import com.dxk.spring.sentinel.customer.service.HelloInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: SpringCloud-Docker-K8s
 * @description: TODO: 测试控制层
 * @author: 丁杏凯
 * @create: 2020-05-12 19:55
 **/
@RestController
public class OpenFeignController {
    @Autowired
    private HelloInterface helloInterface;

    @PostMapping(value = "hello")
    public String hello(@RequestParam(name = "name") String name) {
        return helloInterface.hello(name);
    }
}
