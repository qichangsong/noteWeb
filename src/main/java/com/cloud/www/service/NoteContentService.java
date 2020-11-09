package com.cloud.www.service;

import com.cloud.www.entity.NoteContent;
import com.cloud.www.mapper.NoteContentMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface NoteContentService {

    int insertNote(NoteContent noteContent);
    List<NoteContent> selectNote(Integer indexBegin, Integer pageSize);
}
