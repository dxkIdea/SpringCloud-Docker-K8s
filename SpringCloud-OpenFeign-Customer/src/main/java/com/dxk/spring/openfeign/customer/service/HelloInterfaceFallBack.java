package com.dxk.spring.openfeign.customer.service;

import org.springframework.stereotype.Component;

/**
 * @program: SpringCloud-Docker-K8s
 * @description: TODO: HelloInterface远程调用失败回调时，故障转移
 * @author: 丁杏凯
 * @create: 2020-05-12 20:35
 **/
@Component
public class HelloInterfaceFallBack implements HelloInterface{
    @Override
    public String hello(String name) {
        return "调用Nacos-Provider服务失败, " + name;
    }
}
