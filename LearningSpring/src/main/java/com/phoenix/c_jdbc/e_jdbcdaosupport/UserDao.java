package com.phoenix.c_jdbc.e_jdbcdaosupport;

import com.phoenix.c_jdbc.a_domain.User;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

public class UserDao extends JdbcDaoSupport{
	
	public void update(User user){
		String sql = "update t_user set username=?,password=? where id =?";
		Object[] args = {user.getUsername(),user.getPassword(),user.getId()};
		this.getJdbcTemplate().update(sql, args);
	}

	/**
	 * 查询所有
	 * @return
	 */
	public List<User> findAll() {
		return this.getJdbcTemplate().queryForList("select * from t_user", User.class);
	}

}
