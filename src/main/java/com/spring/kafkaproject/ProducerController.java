package com.spring.kafkaproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    private final KafkaTemplate<String,String> kafkaTemplate;

    public ProducerController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @GetMapping("send/{message}/{topic}")
    public String send(@PathVariable String message,
                       @PathVariable String topic){
        kafkaTemplate.send(topic,"key"+message.length(),message);
        return " Message Sent ... ";
    }

}
