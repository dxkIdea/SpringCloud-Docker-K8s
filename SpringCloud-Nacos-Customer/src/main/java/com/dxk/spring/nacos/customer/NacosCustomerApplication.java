package com.dxk.spring.nacos.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @program: SpringCloud-Docker-K8s
 * @description: Nacos 服务消费者，启动类
 * @author: 丁杏凯
 * @create: 2020-05-08 23:07
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class NacosCustomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosCustomerApplication.class,args);
    }


    /**
     * @Author 丁杏凯
     * @Description @LoadBalanced 与 Ribbon
     * @Date 23:08 2020/5/8
     **/
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
