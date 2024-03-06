package com.demo.servers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public interface LoginServer {


    //判断是否登录成功，如果成功返回令牌
    public String loginVerify(String username,String password);


}
