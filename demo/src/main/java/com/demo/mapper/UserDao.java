package com.demo.mapper;

import com.demo.pojo.student;
import com.demo.pojo.user;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper
public interface UserDao {
    @Select("select * from user")
    public List<user> getAllUser();
    @Select("SELECT * FROM `user` WHERE userId= #{ userId} AND password =#{password}")
    public List <user> getUserByUserIdAndPassword(@Param("userId") String userId, @Param("password") String password);

}
