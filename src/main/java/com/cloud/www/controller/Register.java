package com.cloud.www.controller;

import com.cloud.www.entity.User;
import com.cloud.www.service.impl.InsertUserSerImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Register {
    @Autowired
    InsertUserSerImp insertUserSerImp;
    User user=new User();

    @RequestMapping("/register")
    String register(String name,String password) {
        String s =name;
        String s1 = password;
        String s2;

        if(s==null){
            return "用户名不能为空";
        }else if(s1==null){
            return  "密码不能为空";
        }else {
           s2= insertUserSerImp.selectOne(s).getPassword();
           if(s2==null){
               return "账号不存在";
           }else if(s1.equals(s2)) {
               return "登陆成功";
           }else {
               return "登陆失败";
           }
        }

    }

    @RequestMapping("/show1")
    String show1() {
        return "show1";
    }

}
