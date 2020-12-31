package com.cloud.www.service;

import com.cloud.www.entity.User;


public interface InsertUserSer {
   Integer selectOne(User user);
   void  insertUser(User user);
}
