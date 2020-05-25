package com.dxk.springcloud.netflix.eureka.customer.service;

import org.springframework.stereotype.Service;

/**
 * Created with IDEA.2020
 * User: dxk
 * Date: 2020/5/25
 * Time: 13:26
 * Description: 异常回调
 */
@Service
public class HelloFallService implements HelloService{
    @Override
    public String hello(String name) {
        String s =  "Sorry" + name + ", EUREKA-PROVIDER 服务异常了";
        System.out.println(s);
        return s;
    }
}
