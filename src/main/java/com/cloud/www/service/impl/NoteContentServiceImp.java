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
    int b;
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
    public  int stringMatch(String s){
         if(s.equals("新采购")){
             b=1;
         }else if(s.equals("新物流")){
             b=2;
         }else if(s.equals("运营中心")){
            b=3;
         }else if(s.equals("供应商")){
            b=4;
        }else{
             b=5;
         }
        return b;
    }
}
