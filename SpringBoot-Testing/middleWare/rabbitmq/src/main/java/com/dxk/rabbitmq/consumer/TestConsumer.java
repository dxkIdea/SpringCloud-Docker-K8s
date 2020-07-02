package com.dxk.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created with IDEA.2020
 * User: dxk
 * Date: 2020/7/2
 * Time: 22:36
 * Description: 消费者测试
 */
@Component
public class TestConsumer {

    @RabbitListener(queues = "test")
    public void receive(String message) {
        System.out.println("接收到消息为：" + message);
    }
}
