package com.zhangtao.demo;

import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.kafka.core.KafkaTemplate;

import javax.annotation.Resource;

@RestController
public class ProducerController {
    @Resource
    KafkaTemplate<String,String> kafkaTemplate;

    @RequestMapping("kafka")
    public String data(String msg){
        kafkaTemplate.send("test",1,"爹",msg);
        return "ok";
    }
}
