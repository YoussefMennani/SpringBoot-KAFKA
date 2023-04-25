package com.spring.kafkaproject;


import com.spring.kafkaproject.model.Employe;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    private final KafkaTemplate<Integer, Employe> kafkaTemplate;

    public ProducerController(KafkaTemplate<Integer, Employe> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }
    private static int counter = 0;
    @GetMapping("send/{message}/{topic}")
    public String send(@PathVariable String message,
                       @PathVariable String topic){

        Employe employe = new Employe("youssef","MENNANI",27);

        kafkaTemplate.send(topic,++counter,employe);
        return " Message Sent ... ";
    }


}
