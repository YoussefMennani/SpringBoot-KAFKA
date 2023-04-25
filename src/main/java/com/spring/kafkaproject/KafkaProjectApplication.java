package com.spring.kafkaproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class KafkaProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaProjectApplication.class, args);
    }

}
