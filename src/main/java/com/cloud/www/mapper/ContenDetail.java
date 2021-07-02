package com.cloud.www.mapper;

import com.cloud.www.entity.Content;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

@Mapper
public interface ContenDetail {
    @Select("select * from content")
    List<Content> getAllDetail();
}
