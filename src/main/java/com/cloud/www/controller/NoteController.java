package com.cloud.www.controller;

import com.cloud.www.entity.NoteContent;
import com.cloud.www.service.impl.NoteContentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sun.misc.Contended;

@Controller
public class NoteController {
    @Autowired
    NoteContentServiceImp noteContentServiceImp;
    @PostMapping("/insert")
    String insertNote(@RequestBody NoteContent noteContent){
         noteContentServiceImp.insertNote(noteContent);
         System.out.println(noteContent.toString());
         return "insertNote";
    }
}
