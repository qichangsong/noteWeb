package com.cloud.www.controller;

import com.cloud.www.entity.User;
import com.cloud.www.service.impl.InsertUserSerImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


@Controller
public class Login {
    @Autowired
    InsertUserSerImp insertUserSerImp;
    User user=new User();
    @RequestMapping("/login")
    String login(HttpServletRequest request) {
        String password;
        String pw;
        String name;
        password=request.getParameter("password");
        name=request.getParameter("name");
        System.out.println(name+password);
        if(name==null||password==null){
            return "error";
        }else {
        user=insertUserSerImp.selectOne(name);
        System.out.println(user);
        pw=user.getPassword();
        if(pw==null||!(pw.equals(password))){
            return "error";

        }else{
            return "success";
        }
        }
    }

}
