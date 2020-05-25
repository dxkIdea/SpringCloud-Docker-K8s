package com.dxk.springcloud.netflix.eureka.customer.service;

import org.springframework.stereotype.Service;

/**
 * Created with IDEA.2020
 * User: dxk
 * Date: 2020/5/25
 * Time: 11:21
 * Description: 接口实现层
 */
@Service
public class HelloServiceImpl /*implements HelloService*/{
    /*@Autowired
    private RestTemplate restTemplate;

    @Override
    public String hello(String name) {
        MultiValueMap<String, Object> param = new LinkedMultiValueMap<String, Object>();
        param.add("name",name);
        return restTemplate.postForObject ("http://EUREKA-PROVIDER/hello", param, String.class);
    }*/
}
