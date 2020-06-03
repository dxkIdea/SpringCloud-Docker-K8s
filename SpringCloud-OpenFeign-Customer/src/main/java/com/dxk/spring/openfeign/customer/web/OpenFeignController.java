package com.dxk.spring.openfeign.customer.web;

import com.dxk.spring.openfeign.customer.service.HelloInterface;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: SpringCloud-Docker-K8s
 * @description: 测试控制层
 * @author: 丁杏凯
 * @create: 2020-05-12 19:55
 **/
@RestController
public class OpenFeignController {
    @Resource
    private HelloInterface helloInterface;

    @PostMapping(value = "hello")
    public String hello(@RequestParam(name = "name") String name) {
        return helloInterface.hello(name);
    }
}
