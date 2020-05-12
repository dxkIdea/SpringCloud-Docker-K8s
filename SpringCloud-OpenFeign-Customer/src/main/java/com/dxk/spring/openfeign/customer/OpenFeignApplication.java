package com.dxk.spring.openfeign.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: SpringCloud-Docker-K8s
 * @description: TODO: 声明式调用
 * @author: 丁杏凯
 * @create: 2020-05-12 19:54
 **/
@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
public class OpenFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(OpenFeignApplication.class,args);
    }
}
