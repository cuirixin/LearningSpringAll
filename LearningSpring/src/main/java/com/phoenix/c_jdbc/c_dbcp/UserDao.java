package com.phoenix.c_jdbc.c_dbcp;

import org.springframework.jdbc.core.JdbcTemplate;

import com.phoenix.c_jdbc.a_domain.User;

public class UserDao {
	
	//jdbc模板将由spring注入
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void update(User user){
		String sql = "update t_user set username=?,password=? where id =?";
		Object[] args = {user.getUsername(),user.getPassword(),user.getId()};
		jdbcTemplate.update(sql, args);
	}

}
