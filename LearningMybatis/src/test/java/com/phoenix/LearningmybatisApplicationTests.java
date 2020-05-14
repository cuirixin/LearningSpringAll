package com.phoenix;

import com.phoenix.mapper.UserMapper;
import com.phoenix.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;

@SpringBootTest(classes = Application.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
class LearningmybatisApplicationTests {

    @Test
    void contextLoads() {
    }

    @Resource
    public UserMapper userMapper;

    @Test
    void getUserById() throws Exception {
        System.out.println(userMapper.findUserById(1));
    }

}
