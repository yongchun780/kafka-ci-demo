package com.example.kafka_producer.controller;


import com.example.kafka_producer.service.MessageProducer;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    @Autowired
    private MessageProducer messageProducer;

    @PostMapping
    public String sendMessage(@RequestBody String message) {
        messageProducer.sendMessage(message);
        return "Message sent to Kafka!";
    }
}
