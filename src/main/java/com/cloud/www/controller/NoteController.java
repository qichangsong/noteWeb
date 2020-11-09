package com.cloud.www.controller;

import com.cloud.www.entity.NoteContent;
import com.cloud.www.service.impl.NoteContentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sun.misc.Contended;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class NoteController {
    @Autowired
    NoteContentServiceImp noteContentServiceImp;
    List<NoteContent> list=new ArrayList<NoteContent>();
    @PostMapping("/insert")
    String insertNote(@RequestBody NoteContent noteContent){
         noteContentServiceImp.insertNote(noteContent);
         System.out.println(noteContent.toString());
         return "insertNote";
    }
    @RequestMapping("/select")
    String selectNote(HttpSession session){
        //需要将内容返回给页面，现在还没有处理
        list=noteContentServiceImp.selectNote(1,10);
        session.setAttribute("contents",list);
        for(NoteContent noteContent :list){
            System.out.println(noteContent.getContent());
        }
        return "contentDetail";
    }
}
