//package com.example.kafka_producer.consumer;
//
//import com.example.kafka_producer.service.SimulatedTaskService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Component;
//
//@Component
//public class MessageConsumer {
//
//    @Autowired
//    private SimulatedTaskService simulatedTaskService;
//
//    @KafkaListener(topics = "demo-topic", groupId = "my-group")
//    public void listen(String message) {
//        System.out.println("[Consumer] Received message" );
//        simulatedTaskService.performHeavyTask(message);
//    }
//}
