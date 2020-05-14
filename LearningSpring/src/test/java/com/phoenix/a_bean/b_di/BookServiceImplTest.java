package com.phoenix.a_bean.b_di;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class BookServiceImplTest {

    @Test
    void addBook() {

//        模拟spring执行过程
//        创建service实例：BookService bookService = new BookServiceImpl()    -->IoC  <bean>
//        创建dao实例：BookDao bookDao = new BookDaoImple()				    -->IoC
//        将dao设置给service：bookService.setBookDao(bookDao);				-->DI   <property>

        String xmlPath = "applicationContext.xml";
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

        BookService bookService = (BookService) applicationContext.getBean("bookService");
        bookService.addBook();
    }

}