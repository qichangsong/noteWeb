package com.cloud.demo.service.impl;

import com.cloud.demo.mapper.InsertUser;
import com.cloud.demo.entity.User;
import com.cloud.demo.service.InsertUserSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsertUserSerImp implements InsertUserSer {
    @Autowired
    InsertUser insertUser;
    User user;
    @Override
    public User selectOne(String name) {
        user=insertUser.selectOne(name);
        return user;
    }



}
