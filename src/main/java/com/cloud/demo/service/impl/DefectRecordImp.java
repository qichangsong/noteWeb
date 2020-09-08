package com.cloud.demo.service.impl;

import com.cloud.demo.mapper.DefectRecordSelectDao;
import com.cloud.demo.entity.DefectRecord;
import com.cloud.demo.service.DefectRecordService;
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
