package com.cloud.www.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class DefectRecordController {
    @RequestMapping
    String test() {
        return "index";
    }

}

