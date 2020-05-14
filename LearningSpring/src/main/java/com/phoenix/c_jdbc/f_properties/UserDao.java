package com.phoenix.c_jdbc.f_properties;

import java.util.List;

import com.phoenix.c_jdbc.a_domain.User;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

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

	public User getById(int id) {
		return this.getJdbcTemplate().queryForObject("select * from t_user where id = ?", User.class, id);
	}

}
