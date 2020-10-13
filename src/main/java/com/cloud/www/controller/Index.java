package com.cloud.www.controller;

import com.cloud.www.entity.User;
import com.cloud.www.service.impl.InsertUserSerImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Index {
        @Autowired
        InsertUserSerImp insertUserSerImp;
        User user=new User();
        @RequestMapping("/index")
        String index(){
            return "login";
    }
}
