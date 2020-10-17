package com.cloud.www.mapper;

import com.cloud.www.entity.NoteContent;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NoteContentMapper {
    @Insert("Insert into note_content(id,type,content,isfix) values(#{id},#{type},#{content},#{isfix})")
    int InsertNote(NoteContent noteContent);
}
