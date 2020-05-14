package com.phoenix.e_test.service.impl;


import com.phoenix.e_test.dao.AccountDao;
import com.phoenix.e_test.service.AccountService;
import org.springframework.stereotype.Service;

public class AccountServiceImpl implements AccountService {

	private AccountDao accountDao;
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	@Override
	public void transfer(String outer, String inner, Integer money) {
		accountDao.out(outer, money);
		//断电
//		int i = 1/0;
		accountDao.in(inner, money);
	}

}
