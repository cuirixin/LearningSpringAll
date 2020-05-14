package com.phoenix.d_transaction.b_tx_proxy;

import com.phoenix.d_transaction.b_tx_proxy.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public void demo01(){
		String xmlPath = "applicationContext.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		AccountService accountService =  (AccountService) applicationContext.getBean("proxyAccountService");
		accountService.transfer("jack", "rose", 1000);
	}

}
