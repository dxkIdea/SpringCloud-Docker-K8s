package com.dxk.spring.openfeign.customer.config;

import feign.Retryer;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: SpringCloud-Docker-K8s
 * @description:  请求重试策略配置类
 * @author: 丁杏凯
 * @create: 2020-05-12 20:28
 **/
@Configuration
public class FeignRetryConfig extends FeignClientsConfiguration {

    /**
     * @Author 丁杏凯
     * @Description 默认重试策略
     * @Date 20:30 2020/5/12
     **/
    @Bean
    @Override
    public Retryer feignRetryer() {
        return new Retryer.Default();
    }
}
