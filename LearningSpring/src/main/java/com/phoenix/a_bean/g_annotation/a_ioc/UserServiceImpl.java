package com.phoenix.a_bean.g_annotation.a_ioc;

import org.springframework.stereotype.Component;

@Component("userServiceId")
public class UserServiceImpl implements UserService {

	@Override
	public void addUser() {
		System.out.println("g_annotation.a_ioc add user");
	}

}
