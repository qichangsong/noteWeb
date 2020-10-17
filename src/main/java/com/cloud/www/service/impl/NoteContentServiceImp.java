package com.cloud.www.service.impl;

import com.cloud.www.entity.NoteContent;
import com.cloud.www.mapper.NoteContentMapper;
import com.cloud.www.service.NoteContentService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoteContentServiceImp implements NoteContentService {
    @Autowired
    NoteContentMapper noteContentMapper;
    int a;
    @Override
    public int insertNote(NoteContent noteContent) {
       a= noteContentMapper.InsertNote(noteContent);
        return a;
    }
}
