package com.dxk.spring.openfeign.customer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: SpringCloud-Docker-K8s
 * @description: TODO: openFeign调用接口
 * @author: 丁杏凯
 * @create: 2020-05-12 19:57
 **/
@FeignClient(value = "nacos-provider",fallback = HelloInterfaceFallBack.class)
public interface HelloInterface {
    /**
     * @Author 丁杏凯
     * @Description 声明调用nacos-provider服务的hello接口
     * @Date 20:05 2020/5/12
     * @Param
     * @return
     **/
    @PostMapping(value = "/hello")
    String hello(@RequestParam(name = "name") String name);
}
