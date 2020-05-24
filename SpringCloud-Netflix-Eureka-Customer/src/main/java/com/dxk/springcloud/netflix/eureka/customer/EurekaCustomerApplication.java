package com.dxk.springcloud.netflix.eureka.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created with IntelliJ IDEA.2020
 * User: dxk
 * Date: 2020/5/24
 * Time: 23:59
 * Description: 服务消费者
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaCustomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaCustomerApplication.class,args);
    }
}
