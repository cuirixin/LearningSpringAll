package com.phoenix.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Orders {
    private Integer id;

    private Integer userId;

    private String number;

    private Date createtime;

    private String note;
    
    //订单明细集合
    private List<Orderdetail> detailList;
}