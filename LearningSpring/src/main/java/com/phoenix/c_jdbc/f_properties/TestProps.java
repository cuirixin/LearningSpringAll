package com.phoenix.c_jdbc.f_properties;

import com.phoenix.c_jdbc.a_domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestProps {

	public static void main(String[] args) {
		
		String xmlPath = "com/itheima/f_properties/beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		
		//获得目标类
		UserDao userDao = (UserDao) applicationContext.getBean("userDaoId");
		User user = userDao.getById(1);
		System.out.println(user);
	}

}
