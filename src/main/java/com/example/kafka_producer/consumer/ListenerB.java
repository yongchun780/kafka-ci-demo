package com.example.kafka_producer.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerB {

    @KafkaListener(topics = "demo-topic", groupId = "load-test-group")
    public void listenB(ConsumerRecord<String, String> record) {
        System.out.println("[Listener B] " + record.value());
    }
}