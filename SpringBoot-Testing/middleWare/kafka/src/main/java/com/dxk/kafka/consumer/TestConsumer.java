package com.dxk.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
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

    /**
    * @Description: 消费者组-g-1
    * @Author: 丁杏凯
    * @Date: 2020/7/6 0006 17:20
    */
    @KafkaListener(topics = "kafkaDemo",groupId = "g-1")
    public void receive1(String message) {
        System.out.println("g-1-接收到消息为：" + message);
    }

    /**
     * @Description: 消费者组-g-2
     * @Author: 丁杏凯
     * @Date: 2020/7/6 0006 17:20
     */
    @KafkaListener(topics = "kafkaDemo",groupId = "g-2")
    public void receive2(String message) {
        System.out.println("g-2-接收到消息为：" + message);
    }
}
