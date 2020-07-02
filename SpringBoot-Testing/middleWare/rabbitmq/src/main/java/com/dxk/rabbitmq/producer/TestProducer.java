package com.dxk.rabbitmq.producer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created with IDEA.2020
 * User: dxk
 * Date: 2020/7/2
 * Time: 22:38
 * Description: 生产者测试
 */
@Component
public class TestProducer {
    @Resource
    private AmqpTemplate rabbitTemplate;


    /**
    * @Description: 生产消息
    * @Author: dxk
    * @Date: 2020/7/2 22:39
    */
    public void send(int i) {
        String message = "hello";
        this.rabbitTemplate.convertAndSend("test", message + "---" +i);
    }
}
