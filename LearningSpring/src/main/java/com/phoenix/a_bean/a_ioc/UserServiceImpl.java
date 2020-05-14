package com.phoenix.a_bean.a_ioc;

public class UserServiceImpl implements UserService {

    public UserServiceImpl(String param1, Integer param2) {
        System.out.printf("UserServiceImpl construct: %s %d \n", param1, param2);
    }

    @Override
    public void addUser() {
        System.out.println("Add user success");
    }
}
