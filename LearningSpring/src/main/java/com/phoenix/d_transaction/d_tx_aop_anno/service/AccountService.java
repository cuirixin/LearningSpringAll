package com.phoenix.d_transaction.d_tx_aop_anno.service;

public interface AccountService {
	
	/**
	 * 转账
	 * @param outer
	 * @param inner
	 * @param money
	 */
	public void transfer(String outer, String inner, Integer money);

}
