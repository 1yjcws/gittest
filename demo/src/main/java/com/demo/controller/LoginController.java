package com.demo.controller;


import com.demo.Resoult;
import com.demo.servers.LoginServer;
import io.jsonwebtoken.Jwt;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {
    @Autowired
    private  LoginServer loginServer;
    @RequestMapping("/login")
    @ResponseBody
    public Resoult login(String userid ,String password){
        System.out.println(userid+password);
   String flag= loginServer.loginVerify(userid,password);
   if (!flag.equals("0")){

       return  Resoult.susses("登录成功",flag);

   }
   else
   return Resoult.error("密码或帐号错误");
}

}
