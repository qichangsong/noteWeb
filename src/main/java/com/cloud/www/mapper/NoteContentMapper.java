package com.cloud.www.mapper;

import com.cloud.www.entity.NoteContent;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface NoteContentMapper {
    @Insert("Insert into note_content(id,type,content,isfix) values(#{id},#{type},#{content},#{isfix})")
    int InsertNote(NoteContent noteContent);
    @Select("select * from note_content LIMIT #{indexBegin},#{pageSize}")
    List<NoteContent> selectNote(Integer indexBegin, Integer pageSize);

}
