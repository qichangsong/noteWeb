package com.cloud.www.controller;

import com.cloud.www.entity.Content;
import com.cloud.www.service.imp.GetDetailImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
public class Login {
    @Autowired
    GetDetailImp getDetailImp;
    @RequestMapping("/index")
    String login(Model model, HttpServletRequest request) {

        List<Content> list=getDetailImp.getDetail();
        model.addAttribute("list",list);
       return "contentDetail";
    }
}
