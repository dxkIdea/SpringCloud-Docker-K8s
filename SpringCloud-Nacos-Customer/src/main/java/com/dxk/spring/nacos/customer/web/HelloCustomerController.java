package com.dxk.spring.nacos.customer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: SpringCloud-Docker-K8s
 * @description: TODO: 消费者测试
 * @author: 丁杏凯
 * @create: 2020-05-08 23:10
 **/
@RestController
public class HelloCustomerController {
    @Autowired
    private RestTemplate restTemplate;

    @PostMapping(value = "hello")
    public String hello(@RequestParam(name = "name") String name) {
        MultiValueMap<String, Object> parts = new LinkedMultiValueMap<String, Object>();
        parts.add("name", name);
        return restTemplate.postForObject("http://nacos-provider/hello", parts, String.class);
    }
}
