package com.phoenix.f_web;

import com.phoenix.f_web.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestApp {
	
	@Test
	public void demo01(){
		String xmlPath = "f_web/applicationContext.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		AccountService accountService =  (AccountService) applicationContext.getBean("accountService");
		accountService.transfer("jack", "rose", 1000);
	}

}
