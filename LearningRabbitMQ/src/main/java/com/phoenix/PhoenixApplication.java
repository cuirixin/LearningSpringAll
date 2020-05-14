package com.phoenix;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 自动配置
 * 1, RabbitAutoConfiguration
 * 2, 自动配置了链接工厂ConnectionFactory
 * 3, RabbitProperties封装了MQ配置
 * 4, RabbitTemplate：给MQ发送与接收消息
 * 5, AmqpAdmin: 系统管理功能组件，创建和删除Queue，Exchange，Binding
 * 6, @EnableRabbit + @RabbitListener监听消息队列内容
 */

@EnableRabbit
@SpringBootApplication
public class PhoenixApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhoenixApplication.class, args);
    }

}
