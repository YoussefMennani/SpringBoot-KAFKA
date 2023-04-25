package com.spring.kafkaproject;

import com.fasterxml.jackson.databind.json.JsonMapper;
import com.spring.kafkaproject.model.Employe;
import org.apache.kafka.clients.consumer.ConsumerRecord;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "topic1", groupId ="groupe-ms")
    public void onMessage(ConsumerRecord<Integer, String> cr) throws Exception {
        Employe employe = employeDeserialization(cr.value());
        System.out.println(" ******************* Received MSG ******************");
        System.out.println("KEY => "+cr.key()+" VALUE => "+cr.value().toString());
    }

    private Employe employeDeserialization(String jsonEmploye) throws Exception{
        JsonMapper jsonMapper = new JsonMapper();
        Employe employe = jsonMapper.readValue(jsonEmploye, Employe.class);
        return  employe;
    }

}
