package com.example.kafka_producer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageProducer {

    private static final String TOPIC = "demo-topic";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        kafkaTemplate.send(TOPIC, message);
    }

    public void sendBulkMessages(String baseMessage, int count) {
        for (int i = 0; i < count; i++) {
            String message = baseMessage + " #" + i;
            kafkaTemplate.send(TOPIC, message);
        }
        System.out.println("[Producer] Sent " + count + " messages!");
    }

}
