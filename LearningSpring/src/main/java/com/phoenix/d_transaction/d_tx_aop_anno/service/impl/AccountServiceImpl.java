package com.phoenix.d_transaction.d_tx_aop_anno.service.impl;

import com.phoenix.d_transaction.d_tx_aop_anno.dao.AccountDao;
import com.phoenix.d_transaction.d_tx_aop_anno.service.AccountService;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;



public class AccountServiceImpl implements AccountService {

	private AccountDao accountDao;
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	@Transactional(propagation=Propagation.REQUIRED , isolation = Isolation.DEFAULT)
	@Override
	public void transfer(String outer, String inner, Integer money) {
		accountDao.out(outer, money);
		//断电
		int i = 1/0;
		accountDao.in(inner, money);
	}

}
