package com.phoenix.a_bean.c_inject;

import com.phoenix.a_bean.a_ioc.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class UserBeanFactoryTest {
    @Test
    void test1() {
        // 原方式
        UserBeanFactory userBeanFactory = new UserBeanFactory();
        UserService userService = userBeanFactory.createService();
        userService.addUser();
    }

    @Test
    void test2() {
        // Spring 注入方式
        String xmlPath = "applicationContext.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService = applicationContext.getBean("", UserService.class);
        userService.addUser();
    }
}