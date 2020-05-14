package com.phoenix.a_bean.b_di;

public class BookServiceImpl implements BookService {

    public BookServiceImpl() {
        System.out.println("BookServiceImpl被初始化");
    }

    private BookDao bookDao;

    // 需要set函数
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public void addBook() {
        this.bookDao.save();
    }


}
