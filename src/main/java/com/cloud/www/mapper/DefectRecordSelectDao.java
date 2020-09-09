package com.cloud.www.mapper;

import com.cloud.www.entity.DefectRecord;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;


import java.util.List;

@Mapper
public interface DefectRecordSelectDao {
    //当列名和属性名成功不同时，可以通过映射的方式匹配
    @Results({
            @Result(column = "own_system",property = "ownSystem"),
            @Result(column = "is_repair",property = "isRepair"),
            @Result(column = "create_time",property = "createTime")
    })
    @Select("select * from defect_record")
    List<DefectRecord> findAll();
}
