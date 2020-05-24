package com.dxk.springcloud.netflix.eureka.provider.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.2020
 * User: dxk
 * Date: 2020/5/24
 * Time: 23:33
 * Description: 测试类
 */
@RestController
public class HelloController {

    @PostMapping(value = "/hello")
    public String hello (@RequestParam(name = "name") String name) {
        return "hello, " + name;
    }
}
