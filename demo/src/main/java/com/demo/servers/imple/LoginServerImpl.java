package com.demo.servers.imple;

import com.demo.mapper.UserDao;
import com.demo.pojo.user;
import com.demo.servers.LoginServer;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LoginServerImpl implements LoginServer {
    @Autowired
    private  UserDao userDao;
    @Override
    public String loginVerify(String userid, String password) {

        List<user> user= userDao.getUserByUserIdAndPassword(userid,password);
        System.out.println(user.size());
        if(!user.isEmpty()){
          return lingPai(userid, password);
        }
        return "0";
    }
    public String lingPai(String userid ,String password){
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("userid",userid);
        map.put("password",password);
        return Jwts.builder().signWith(SignatureAlgorithm.HS256,"yang@261881").
                setClaims(map).setExpiration(new Date(System.currentTimeMillis()+3600*12*1000)).compact();
  }
}
