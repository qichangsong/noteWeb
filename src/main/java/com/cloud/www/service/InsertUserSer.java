package com.cloud.www.service;

import com.cloud.www.entity.User;


public interface InsertUserSer {
   User selectOne(String name);
   void  insertUser(User user);
}
