package com.phoenix.d_transaction.c_tx_aop_xml.service;

public interface AccountService {
	
	/**
	 * 转账
	 * @param outer
	 * @param inner
	 * @param money
	 */
	public void transfer(String outer, String inner, Integer money);

}
