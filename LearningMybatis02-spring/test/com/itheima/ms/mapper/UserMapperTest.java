package com.itheima.ms.mapper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.ms.po.User;

/**
 * <p>Title: UserMapperTest</p>
 * <p>Description: TODO(这里用一句话描述这个类的作用) <p>
 * <p>Company: www.itcast.com</p>
 * @author 传智.关云长 
 * @date 2015-12-23 下午5:12:46  
 * @version 1.0
 */
public class UserMapperTest {

	private ApplicationContext ctx;

	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext(
				"spring/applicationContext.xml");
	}


	@Test
	public void testFindUserById() {
		UserMapper mapper = (UserMapper) ctx.getBean("userMapper");
		
		User user = mapper.findUserById(1);
		
		System.out.println(user);
	}

}
