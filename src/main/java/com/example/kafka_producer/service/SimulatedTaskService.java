package com.example.kafka_producer.service;

import org.springframework.stereotype.Service;

@Service
public class SimulatedTaskService {
    public void performHeavyTask(String message) {
        System.out.println("🕒 开始处理任务：" + message);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("✅ 完成任务：" + message);
    }
}
