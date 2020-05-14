package com.phoenix.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class User implements Serializable {
    private int id;
    private String username;// 用户姓名
    private Integer sex;// 性别
    private Date birthday;// 生日
    private String address;// 地址

    //订单信息
    private List<Orders> orders;
}
