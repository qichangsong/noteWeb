package com.cloud.www.service.impl;

import com.cloud.www.mapper.DefectRecordSelectDao;
import com.cloud.www.entity.DefectRecord;
import com.cloud.www.service.DefectRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DefectRecordImp implements DefectRecordService {
    @Autowired
    DefectRecordSelectDao defectRecordSelectDao;

    @Override
    public List<DefectRecord> getAll() {

        return defectRecordSelectDao.findAll();
    }
}
