package com.phoenix.model;

import lombok.Data;

import java.util.Date;

@Data
public class Items {
    private Integer id;

    private String name;

    private Float price;

    private String pic;

    private Date createtime;

    private String detail;


	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", price=" + price
				+ ", pic=" + pic + ", createtime=" + createtime + ", detail="
				+ detail + "]";
	}
    
}