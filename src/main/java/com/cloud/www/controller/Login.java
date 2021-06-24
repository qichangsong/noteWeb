package com.cloud.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


@Controller
public class Login {

    @RequestMapping("/index")
    String login(HttpServletRequest request) {
       return "contentDetail";
    }
}
