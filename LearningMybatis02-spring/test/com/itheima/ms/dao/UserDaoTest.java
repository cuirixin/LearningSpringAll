package com.itheima.ms.dao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.ms.po.User;

/**
 *  
 * <p>
 * Title: UserDaoTest
 * </p>
 *  
 * <p>
 * Description: TODO(这里用一句话描述这个类的作用) 
 * <p>
 * <p>
 * Company: www.itcast.com
 * </p>
 *  @author 传智.关云长   @date 2015-12-23 下午5:04:53    @version 1.0
 */
public class UserDaoTest {
	
	private ApplicationContext ctx;

	@Before
	public void setUp() throws Exception {
		ctx = new ClassPathXmlApplicationContext(
				"spring/applicationContext.xml");
	}

	@Test
	public void testFindUserById() throws Exception {
		// 创建UserDao
		UserDao dao = (UserDao) ctx.getBean("userDao");
		
		User user = dao.findUserById(1);
		
		System.out.println(user);
	}

}
