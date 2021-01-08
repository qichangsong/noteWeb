package com.cloud.www.controller;

import com.cloud.www.entity.User;
import com.cloud.www.service.impl.InsertUserSerImp;
import netscape.javascript.JSObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Register {
    @Autowired
    InsertUserSerImp insertUserSerImp;
    @PostMapping("/register")
    public String register(@RequestBody User user){
        System.out.println(user.toString());
        try {
            insertUserSerImp.insertUser(user);
        }catch (Exception e){
            return "插入错误";
        }

        return "success";
    }
    @GetMapping("/getAllUsers")
    public String list(){
        List<User> list=insertUserSerImp.selectAll();
        return list.toString();
    }
}
