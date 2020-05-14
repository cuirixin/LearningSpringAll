package com.phoenix.model;

import lombok.Data;

import java.util.List;

@Data
public class OrdersExt extends Orders {

	// user.`username`,
	// user.`sex`
	private String username;

	private String sex;

	//用户信息
	private User user;
	
	//订单明细信息
	private List<Orderdetail> detailList;

}
