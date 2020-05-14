package com.phoenix.config;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * description:
 * date: 2020/5/6 10:59 下午
 * author: phoenix
 * version: 1.0.0
 */
@Configuration
public class MyAMQPConfig {

    // 自定义的MessageConverter
    @Bean
    MessageConverter messageConverter() {
        return new Jackson2JsonMessageConverter();
    }
}
