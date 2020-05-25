package com.dxk.springcloud.netflix.eureka.customer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IDEA.2020
 * User: dxk
 * Date: 2020/5/25
 * Time: 11:21
 * Description: 接口实现层
 */
@Service
public class HelloServiceImpl implements HelloService{
    @Autowired
    private RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "hellFall")
    public String hello(String name) {
        MultiValueMap<String, Object> param = new LinkedMultiValueMap<>();
        param.add("name",name);
        return restTemplate.postForObject ("http://EUREKA-PROVIDER/hello", param, String.class);
    }


    /**
    * @Description: 服务异常回调方法
    * @Author: dxk
    * @Date: 2020/5/25 21:49
    */
    private String hellFall(String name) {
        return "Sorry " + name + ", EUREKA-PROVIDER服务异常了！";
    }
}
