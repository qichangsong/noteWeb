package com.cloud.www.mapper;

import com.cloud.www.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface InsertUser {
    @Select("select * from user where name=#{name} limit 0,1")
    User  selectOne(String name);
    @Insert("insert into user(id,name,password values(#{id},#{name},#{password})")
    void  InsertUser(User usr);
}
