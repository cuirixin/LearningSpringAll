package com.phoenix.c_jdbc.d_c3p0;

import java.util.List;

import com.phoenix.c_jdbc.a_domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestC3P0 {

	public static void main(String[] args) {
		
		String xmlPath = "com/itheima/d_c3p0/beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		
		//获得目标类
		UserDao userDao = (UserDao) applicationContext.getBean("userDaoId");
		List<User> allUser = userDao.findAll();
		for (User user : allUser) {
			System.out.println(user);
		}
	}

}
