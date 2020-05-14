package com.phoenix.c_jdbc.d_c3p0;

import java.util.List;

import com.phoenix.c_jdbc.a_domain.User;
import org.springframework.jdbc.core.JdbcTemplate;

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

	/**
	 * 查询所有
	 * @return
	 */
	public List<User> findAll() {
		return jdbcTemplate.queryForList("select * from t_user", User.class);
	}

}
