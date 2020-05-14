package com.phoenix.model;

import lombok.Data;

@Data
public class Orderdetail {
    private Integer id;

    private Integer ordersId;

    private Integer itemsId;

    private Integer itemsNum;
    
    //商品信息
    private Items items;


	@Override
	public String toString() {
		return "Orderdetail [id=" + id + ", ordersId=" + ordersId
				+ ", itemsId=" + itemsId + ", itemsNum=" + itemsNum + "]";
	}
    
}