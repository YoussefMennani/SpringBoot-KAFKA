package com.spring.kafkaproject;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "quickstart", groupId ="groupe-ms")
    public void onMessage(ConsumerRecord<String,String> cr){
        System.out.println(" ******************* Received MSG ******************");
        System.out.println("KEY => "+cr.key()+" VALUE => "+cr.value());
    }
}
