package com.dxk.rabbitmq.web;

import com.dxk.rabbitmq.producer.TestProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IDEA.2020
 * User: dxk
 * Date: 2020/7/2
 * Time: 22:39
 * Description: 测试控制层
 */
@RestController
public class TestController {
    @Autowired
    private TestProducer testProducer;

    @GetMapping(value = "test")
    public void test() {
        for (int i = 0; i < 100; i++) {
            testProducer.send(i);
        }
    }
}
