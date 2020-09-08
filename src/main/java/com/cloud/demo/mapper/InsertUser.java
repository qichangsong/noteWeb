package com.cloud.demo.mapper;

import com.cloud.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface InsertUser {
    @Select("select * from user where name=#{name}")
    User  selectOne(String name);
}
