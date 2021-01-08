package com.cloud.www.service;

import com.cloud.www.entity.User;

import java.util.List;


public interface InsertUserSer {
   Integer selectOne(User user);
   void  insertUser(User user);
   List<User> selectAll();
}
