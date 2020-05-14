package com.phoenix.a_bean.a_ioc;

import com.phoenix.a_bean.a_ioc.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class UserServiceImplTest {

    @Test
    void addUser() {
//        UserService userService = new UserServiceImpl();
//        userService.addUser();
        String xmlPath = "applicationContext.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.addUser();
    }
}