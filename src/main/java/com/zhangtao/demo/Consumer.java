package com.zhangtao.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;

@Configuration
public class Consumer {
    @KafkaListener(topicPartitions = @TopicPartition(topic = "test",partitions = {"0","1"}))
    public void consumer(String mm){
        System.out.println(mm);
    }
}
