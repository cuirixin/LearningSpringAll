package com.phoenix;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class PhoenixApplicationTests {

    @Resource
    RabbitTemplate rabbitTemplate;

    @Resource
    AmqpAdmin amqpAdmin;

    @Test
    void createExchange() {
        // 创建Exchnage
        // amqpAdmin.declareExchange(new DirectExchange("amqpadmin.exchange"));
        // 创建Queue
        // amqpAdmin.declareQueue(new Queue("amqpadmin.queue"));
        // amqpAdmin.declareBinding(new Binding("amqpadmin.queue", Binding.DestinationType.QUEUE, "amqpadmin.exchange", "amqpadmin.haha", null));
    }

    /**
     * 单播
     */
    @Test
    void sendMsg() {
        Map<String, Object> map = new HashMap<>();
        map.put("msg", "单播测试消息");
        map.put("data", Arrays.asList("ABC", 1, true));
        rabbitTemplate.convertAndSend("direct.demo", "queue.demo", map);
    }
    /**
     * Receive
     */
    @Test
    void receiveMsg() {
        Object o = rabbitTemplate.receiveAndConvert("queue.demo");
        System.out.println(o.getClass());
        System.out.println(o);
    }

    @Test
    void sendMsgFanout() {
        Map<String, Object> map = new HashMap<>();
        map.put("msg", "组播测试消息");
        map.put("data", Arrays.asList("ABC", 1, true));
        rabbitTemplate.convertAndSend("fanout.demo", "", map);
    }

}
