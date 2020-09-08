package com.cloud.demo.service.impl;

import com.cloud.demo.dao.AreasDao;
import com.cloud.demo.entity.AreasEntity;
import com.cloud.demo.service.AreasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AreasServiceImpl implements AreasService {
    //这里在业务层实现AreasDao的自动注入
     @Autowired
    private AreasDao areasDao;

    @Override
    public List<AreasEntity> getAll() {
        System.out.println("service验证");
        return areasDao.findAll();

    }
    public AreasServiceImpl(){
        System.out.println("是否初始化成功");
    }
}
