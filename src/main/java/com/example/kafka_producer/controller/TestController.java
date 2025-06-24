package com.example.kafka_producer.controller;

import com.example.kafka_producer.service.MessageProducer;
import com.example.kafka_producer.service.SimulatedTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @Autowired
    private SimulatedTaskService simulatedTaskService;

    @Autowired
    private MessageProducer messageProducer;
    @RequestMapping("/sync")
    public String sync(@RequestParam String msg) {
        simulatedTaskService.performHeavyTask(msg);
        return "Synchronous task executed!";
    }
    @RequestMapping("/async")
    public String async(@RequestParam String msg) {
        messageProducer.sendMessage(msg);
        return "Asynchronous task executed!";
    }
    @GetMapping("/bulk")
    public String bulkSend(@RequestParam(defaultValue = "100") int count) {
        messageProducer.sendBulkMessages("test", count);
        return count + " messages sent!";
    }
}
