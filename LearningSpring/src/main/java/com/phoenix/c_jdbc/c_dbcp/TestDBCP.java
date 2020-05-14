package com.phoenix.c_jdbc.c_dbcp;

import com.phoenix.c_jdbc.a_domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDBCP {

    public static void main(String[] args) {
		User user = new User();
		user.setId(1);
		user.setUsername("接客");
		user.setPassword("998");

		String xmlPath = "com/itheima/c_dbcp/beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

		//获得目标类
		UserDao userDao = (UserDao) applicationContext.getBean("userDaoId");
		userDao.update(user);
	}

}
