package com.phoenix.d_transaction.a_tx_template.service.impl;

import com.phoenix.d_transaction.a_tx_template.dao.AccountDao;
import com.phoenix.d_transaction.a_tx_template.service.AccountService;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;


public class AccountServiceImpl implements AccountService {

	private AccountDao accountDao;
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	//需要spring注入模板
	private TransactionTemplate transactionTemplate;
	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}
	@Override
	public void transfer(final String outer,final String inner,final Integer money) {
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus arg0) {
				accountDao.out(outer, money);
				//断电
//				int i = 1/0;
				accountDao.in(inner, money);
			}
		});

	}

}
