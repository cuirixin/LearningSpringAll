package com.phoenix.a_bean.a_ioc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class UserServiceImplTest2 {

    @Autowired // 与junit整合，不需要在spring xml配置扫描
    private UserService userService;
    @Test
    public void addUser() {
//        String xmlPath = "applicationContext.xml";
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
//        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.addUser();
    }
}