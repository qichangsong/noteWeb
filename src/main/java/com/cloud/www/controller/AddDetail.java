package com.cloud.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddDetail {
    @RequestMapping("/addDetail")
    public  String addDetail(){
        return "add";
    }
}
