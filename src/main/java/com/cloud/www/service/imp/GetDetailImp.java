package com.cloud.www.service.imp;

import com.cloud.www.entity.Content;
import com.cloud.www.mapper.ContenDetail;
import com.cloud.www.service.GetDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetDetailImp implements GetDetail {
    @Autowired
    ContenDetail contenDetail;
    @Override
    public List<Content> getDetail() {
       List<Content>  list= contenDetail.getAllDetail();
        return list;
    }
}
