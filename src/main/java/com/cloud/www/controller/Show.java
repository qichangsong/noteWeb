package com.cloud.www.controller;

import com.alibaba.fastjson.JSON;
import com.cloud.www.entity.AreasEntity;
import com.cloud.www.service.impl.AreasServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;


@RestController
public class Show {
    @Autowired
    AreasServiceImpl areasService;
    @RequestMapping("/show")
    public  String  showPage(){
        List<AreasEntity> list=areasService.getAll();
       String s= JSON.toJSON(list).toString();
        return s;
    }
}
