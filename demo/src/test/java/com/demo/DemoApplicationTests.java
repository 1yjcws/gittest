package com.demo;

import com.demo.mapper.UserDao;
import com.demo.pojo.student;
import com.demo.pojo.user;
import com.demo.servers.LoginServer;
import com.demo.servers.imple.LoginServerImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private LoginServer loginServer;
    @Test
    void contextLoads() {


        System.out.println(this.loginServer.loginVerify("1234","1234"));

    }

}
