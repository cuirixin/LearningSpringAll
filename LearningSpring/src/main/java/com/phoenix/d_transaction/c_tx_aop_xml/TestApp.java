package com.phoenix.d_transaction.c_tx_aop_xml;

import com.phoenix.d_transaction.c_tx_aop_xml.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestApp {

	public void demo01(){
		String xmlPath = "applicationContext.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		AccountService accountService =  (AccountService) applicationContext.getBean("accountService");
		accountService.transfer("jack", "rose", 1000);
	}

}
