package com.phoenix.a_bean.c_inject;

import com.phoenix.a_bean.a_ioc.UserService;
import com.phoenix.a_bean.a_ioc.UserServiceImpl;

public class UserStaticBeanFactory {
    public static UserService createService() {
        System.out.println("UserStaticBeanFactory 创建 UserService");
        return new UserServiceImpl("ssss", 0);
    }
}
