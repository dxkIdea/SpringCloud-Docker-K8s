package com.dxk.springcloud.netflix.eureka.customer.web;

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

    @PostMapping(value = "/hello")
    public String hello (@RequestParam(name = "name") String name) {
        return "hello, " + name;
    }
}
