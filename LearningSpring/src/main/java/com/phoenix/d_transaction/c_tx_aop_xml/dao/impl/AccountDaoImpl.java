package com.phoenix.d_transaction.c_tx_aop_xml.dao.impl;

import com.phoenix.d_transaction.c_tx_aop_xml.dao.AccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;


public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

	@Override
	public void out(String outer, Integer money) {
		this.getJdbcTemplate().update("update account set money = money - ? where username = ?", money,outer);
	}

	@Override
	public void in(String inner, Integer money) {
		this.getJdbcTemplate().update("update account set money = money + ? where username = ?", money,inner);
	}

}
