package com.cloud.www.service.impl;

import com.cloud.www.mapper.InsertUser;
import com.cloud.www.entity.User;
import com.cloud.www.service.InsertUserSer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import java.util.List;

@Service
public class InsertUserSerImp implements InsertUserSer {
    @Autowired
    InsertUser insertUser;


    @Override
    public Integer selectOne(User user) {
        String pw=DigestUtils.md5DigestAsHex(user.getPassword().getBytes());
    //    System.out.println(pw);
        user.setPassword(pw);
        return insertUser.selectOne(user);
    }

    @Override
    public void insertUser(User user) {
        String pw=DigestUtils.md5DigestAsHex(user.getPassword().getBytes());
        //    System.out.println(pw);
        user.setPassword(pw);
        insertUser.InsertUser(user);
    }

    @Override
    public List<User> selectAll() {
        List<User> list=insertUser.selectAll();
        return list;
    }


}
