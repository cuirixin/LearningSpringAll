package com.phoenix.e_test;

import com.phoenix.e_test.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= "classpath:/e_test/applicationContext.xml")
public class TestApp {

	@Autowired  //与junit整合，不需要在spring xml配置扫描
	private AccountService accountService;

	@Test
	public void demo01(){
//		String xmlPath = "applicationContext.xml";
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
//		AccountService accountService =  (AccountService) applicationContext.getBean("accountService");
		//accountService.transfer("jack", "rose", 1000);
	}

}
