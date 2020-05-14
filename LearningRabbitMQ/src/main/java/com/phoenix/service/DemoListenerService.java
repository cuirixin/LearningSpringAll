package com.phoenix.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

/**
 * description:
 * date: 2020/5/6 11:05 下午
 * author: phoenix
 * version: 1.0.0
 */

@Service
// 用于指定消费者环境
@ConditionalOnProperty(prefix = "consumer", name = "enabled", havingValue = "true")
public class DemoListenerService {

    @RabbitListener(queues = "queue.demo")
    public void receiveMsg(Object o) {
        System.out.print("监听到消息: ");
        System.out.println(o);
    }
}
