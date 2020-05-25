package com.dxk.spring.sentinel.customer.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.stereotype.Service;

/**
 * @program: SpringCloud-Docker-K8s
 * @description:  失败回调
 * @author: 丁杏凯
 * @create: 2020-05-12 22:01
 **/
@Service
public class HelloInterfaceFallBack implements HelloInterface{
    @Autowired
    private ConfigurableEnvironment configurableEnvironment;

    @Override
    @SentinelResource(value = "/hello", blockHandler = "exceptionHandler", fallback = "defaultFallback")
    public String hello(String name) {
        return null;
    }

    //默认的 fallback 函数名称
    public String defaultFallback() {
        return "default_fallback";
    }
}
