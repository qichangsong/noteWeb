package com.cloud.www.mapper;

import com.cloud.www.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface InsertUser {
    @Select("select count(1) from user where name=#{name} and password=#{password}")
    Integer  selectOne(User user);
    @Insert("insert into user(id,name,password values(#{id},#{name},#{password})")
    void  InsertUser(User usr);
}
