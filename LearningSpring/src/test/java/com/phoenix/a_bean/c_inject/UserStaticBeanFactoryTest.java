package com.phoenix.a_bean.c_inject;

import com.phoenix.a_bean.a_ioc.UserService;
import com.phoenix.a_bean.c_inject.UserStaticBeanFactory;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class UserStaticBeanFactoryTest {

    @Test
    void test1() {
        // 原方式
        UserService userService = UserStaticBeanFactory.createService();
        userService.addUser();
    }

    @Test
    void test2() {
        /**
         * Spring 注入方式
         * <bean id="userBeanFactory" class="com.phoenix.c_inject.UserBeanFactory"></bean>
         * <bean id="userServiceByBeanFactory" factory-bean="userBeanFactory" factory-method="createService"></bean>
         */

        String xmlPath = "applicationContext.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService = applicationContext.getBean("userServiceByBeanFactory", UserService.class);
        userService.addUser();
    }

}