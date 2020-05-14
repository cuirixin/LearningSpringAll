package com.phoenix.a_bean.b_di;

public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("add book");
    }
}
