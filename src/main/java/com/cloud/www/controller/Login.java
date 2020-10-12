package com.cloud.www.controller;

import com.cloud.www.entity.User;
import com.cloud.www.service.impl.InsertUserSerImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Login {
    @Autowired
    InsertUserSerImp insertUserSerImp;
    User user=new User();
    @RequestMapping("/login")
    String login(String name,String password) {
        String pw;
        if(name==null||password==null){
            return "error";
        }else {
        pw=insertUserSerImp.selectOne(name).getPassword();
        if(pw==null||!(pw.endsWith(password))){
            return "error";
        }else{
            return "success";
        }
        }
    }

}
