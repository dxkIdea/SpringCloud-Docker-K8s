package com.dxk.spring.nacos.customer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * Created with IDEA.2020
 * User: dxk
 * Date: 2020/6/10
 * Time: 22:06
 * Description: kafka消息队列监听
 */
@Component
public class KafkaConsumerListener {
    /**
    * @Description:  监听testTopic队列
    * @Author: dxk
    * @Date: 2020/6/10 22:07
    */
    @KafkaListener(topics = "testTopic")
    public void onMessage(String message){
        System.out.println("监听消息为：" + message);
    }
}
