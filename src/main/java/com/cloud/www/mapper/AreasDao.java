package com.cloud.www.mapper;

import com.cloud.www.entity.AreasEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AreasDao {
    //通过mybatis的注解，将实体类和查询结果做自动映射
    @Select("select aid,atitle,pid from areas")
    List<AreasEntity> findAll() ;
    }

