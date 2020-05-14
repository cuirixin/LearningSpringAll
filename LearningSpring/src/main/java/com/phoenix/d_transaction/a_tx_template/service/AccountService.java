package com.phoenix.d_transaction.a_tx_template.service;

public interface AccountService {
	
	/**
	 * 转账
	 * @param outer
	 * @param inner
	 * @param money
	 */
	public void transfer(String outer, String inner, Integer money);

}
