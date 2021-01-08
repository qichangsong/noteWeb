package com.cloud.www.mapper;

import com.cloud.www.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface InsertUser {
    @Select("select count(1) from user where name=#{name} and password=#{password}")
    Integer  selectOne(User user);
    @Insert("insert into user values(#{id},#{name},#{password})")
    void  InsertUser(User usr);
    @Select("select * from user")
    List<User> selectAll();
}
