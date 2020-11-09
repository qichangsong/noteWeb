package com.cloud.www.service.impl;

import com.cloud.www.mapper.InsertUser;
import com.cloud.www.entity.User;
import com.cloud.www.service.InsertUserSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsertUserSerImp implements InsertUserSer {
    @Autowired
    InsertUser insertUser;


    @Override
    public User selectOne(String name) {
        return insertUser.selectOne(name);
    }

    @Override
    public void insertUser(User user) {
        insertUser.InsertUser(user);
    }


}
