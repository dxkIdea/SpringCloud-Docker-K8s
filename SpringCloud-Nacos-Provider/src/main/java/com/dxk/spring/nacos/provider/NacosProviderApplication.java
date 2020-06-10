package com.dxk.spring.nacos.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @program: SpringCloud-Docker-K8s
 * @description: Nocas服务提供者，启动类
 * @author: 丁杏凯
 * @create: 2020-05-08 22:39
 **/
@EnableScheduling
@SpringBootApplication
@EnableDiscoveryClient
public class NacosProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosProviderApplication.class,args);
    }
}
