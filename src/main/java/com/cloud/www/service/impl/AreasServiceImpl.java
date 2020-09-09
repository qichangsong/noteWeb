package com.cloud.www.service.impl;

import com.cloud.www.mapper.AreasDao;
import com.cloud.www.entity.AreasEntity;
import com.cloud.www.service.AreasService;
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
