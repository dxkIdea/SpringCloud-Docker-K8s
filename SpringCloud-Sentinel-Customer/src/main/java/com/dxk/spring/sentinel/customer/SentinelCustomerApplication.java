package com.dxk.spring.sentinel.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: SpringCloud-Docker-K8s
 * @description: TODO: sentinel客户端
 * @author: 丁杏凯
 * @create: 2020-05-12 21:14
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelCustomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SentinelCustomerApplication.class,args);
    }
}
