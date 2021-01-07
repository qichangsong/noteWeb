package com.cloud.www.controller;

import com.cloud.www.entity.User;
import com.cloud.www.service.impl.InsertUserSerImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


@Controller
public class Login {
    @Autowired
    InsertUserSerImp insertUserSerImp;
    User user = new User();

    @RequestMapping("/login")
    String login(HttpServletRequest request) {
        String password;
        //  String pw;
        String name;
        password = request.getParameter("password");
        name = request.getParameter("name");
        user.setName(name);
        user.setPassword(password);
        //   System.out.println(name + password);
        try {
            if (insertUserSerImp.selectOne(user) == 1) {
                    return "contentDetail";
                } else {
                    return "index";
                }

        } catch (Exception e) {
            return "index";
        }
    }
}
