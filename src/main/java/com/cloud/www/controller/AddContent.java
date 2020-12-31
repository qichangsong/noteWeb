package com.cloud.www.controller;

import com.cloud.www.entity.NoteContent;
import com.cloud.www.entity.User;
import com.cloud.www.service.impl.NoteContentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AddContent {
    //这个要给content中传入到NoteContent中，需要在service给定默认值
    @Autowired
    NoteContentServiceImp noteContentServiceImp;
    NoteContent noteContent =new NoteContent();
    int a;
    @RequestMapping("/add")
    String add(HttpServletRequest request) {
        noteContent.setContent(request.getParameter("text1"));
       noteContent.setType(noteContentServiceImp.stringMatch(request.getParameter("type")));
       a= noteContentServiceImp.insertNote(noteContent);
       if(a==1){
           return "contentDetail";
       }else{
           return "error";
       }



    }
}
