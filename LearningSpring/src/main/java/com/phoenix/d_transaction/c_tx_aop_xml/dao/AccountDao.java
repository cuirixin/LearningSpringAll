package com.phoenix.d_transaction.c_tx_aop_xml.dao;

public interface AccountDao {
	/**
	 * 汇款
	 * @param outer
	 * @param money
	 */
	public void out(String outer, Integer money);
	
	/**
	 * 收款
	 * @param inner
	 * @param money
	 */
	public void in(String inner, Integer money);

}
