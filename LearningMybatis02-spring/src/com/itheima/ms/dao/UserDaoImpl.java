package com.itheima.ms.dao;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.itheima.ms.po.User;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>Title: UserDaoImpl</p>
 * <p>Description: TODO(这里用一句话描述这个类的作用) <p>
 * <p>Company: www.itcast.com</p>
 * @author 传智.关云长 
 * @date 2015-12-23 下午4:59:41  
 * @version 1.0
 */

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	@Override
	public User findUserById(int id) throws Exception {
		return this.getSqlSession().selectOne("test.findUserById", id);
	}

}
