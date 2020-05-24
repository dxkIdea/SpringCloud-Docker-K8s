package com.dxk.springcloud.netflix.eureka.provider;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
* @Description: eureka注册中心，服务提供者
* @Author: dxk
* @Date: 2020/5/24
*/
@SpringBootApplication
@EnableEurekaClient
public class EurekaProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaProviderApplication.class,args);
    }
}
