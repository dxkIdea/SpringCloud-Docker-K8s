package com.dxk.kafka.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.UUID;

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
    private KafkaTemplate<String,Object> kafkaTemplate;
    /**
    * @Description: 生产消息
    * @Author: dxk
    * @Date: 2020/7/2 22:39
    */
    @Scheduled(cron = "*/10 * * * * ?")
    public void send() {
        try{
            String msgInfo = "时间戳：" + System.currentTimeMillis();
            kafkaTemplate.send("kafkaDemo", UUID.randomUUID().toString(),msgInfo).addCallback(success -> {
                // 消息发送到的topic
                String topic = success.getRecordMetadata().topic();
                // 消息发送到的分区
                int partition = success.getRecordMetadata().partition();
                // 消息在分区内的offset
                long offset = success.getRecordMetadata().offset();
                System.out.println("发送消息成功:" + topic + "-" + partition + "-" + offset);
            },failure -> {
                System.out.println("发送消息失败:" + failure.getMessage());
            });
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
