package com.cloud.www.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface DefectRecordInsertDao {

        @Insert("insert into defect_record values() ")
        boolean insert();

}
