package com.dxk.springcloud.netflix.eureka.customer.web;

import com.dxk.springcloud.netflix.eureka.customer.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.2020
 * User: dxk
 * Date: 2020/5/25
 * Time: 0:00
 * Description: 测试类
 */
@RestController
public class HelloController {
    @Autowired
    private HelloService helloService;

    @PostMapping(value = "/hello")
    public String hello (@RequestParam(name = "name") String name) {
        return helloService.hello(name);
    }
}
