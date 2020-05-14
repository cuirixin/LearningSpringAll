package com.phoenix.a_bean.c_inject;


import com.phoenix.a_bean.a_ioc.UserService;
import com.phoenix.a_bean.a_ioc.UserServiceImpl;

public class UserBeanFactory {
    public UserService createService(){
        return new UserServiceImpl("ttt", 0);
    }
}
