package com.phoenix.d_transaction.b_tx_proxy.service.impl;


import com.phoenix.d_transaction.b_tx_proxy.dao.AccountDao;
import com.phoenix.d_transaction.b_tx_proxy.service.AccountService;

public class AccountServiceImpl implements AccountService {

	private AccountDao accountDao;
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	@Override
	public void transfer(String outer, String inner, Integer money) {
		accountDao.out(outer, money);
		//断电
		int i = 1/0;
		accountDao.in(inner, money);
	}

}
