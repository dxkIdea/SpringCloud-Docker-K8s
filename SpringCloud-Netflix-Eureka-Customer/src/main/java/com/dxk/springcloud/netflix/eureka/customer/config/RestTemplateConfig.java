package com.dxk.springcloud.netflix.eureka.customer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IDEA.2020
 * User: dxk
 * Date: 2020/5/25
 * Time: 12:33
 * Description: RestTemplate 初始化类
 */
@Configuration
public class RestTemplateConfig {

    /**
    * @Description: 启动负载均衡
    * @Author: dxk
    * @Date: 2020/5/25 12:34
    */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
