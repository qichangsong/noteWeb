package com.cloud.www.service.impl;

import com.cloud.www.entity.NoteContent;
import com.cloud.www.mapper.NoteContentMapper;
import com.cloud.www.service.NoteContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteContentServiceImp implements NoteContentService {
    @Autowired
    NoteContentMapper noteContentMapper;
    int a;
    @Override
    public int insertNote(NoteContent noteContent) {
        //需要处理默认值
       a= noteContentMapper.InsertNote(noteContent);
        return a;
    }

    @Override
    public List<NoteContent> selectNote(Integer indexBegin, Integer pageSize) {
        return noteContentMapper.selectNote(indexBegin,pageSize);
    }
}
