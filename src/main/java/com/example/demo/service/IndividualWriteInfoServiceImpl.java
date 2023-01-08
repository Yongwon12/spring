package com.example.demo.service;

import com.example.demo.model.aws.dao.IndividualWriteInfoMapper;
import com.example.demo.model.aws.dto.IndividualWriteInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
@RequiredArgsConstructor
@Service
public class IndividualWriteInfoServiceImpl implements IndividualWriteInfoService {
    private final IndividualWriteInfoMapper individualWriteInfoMapper;
    @Override
    public List<IndividualWriteInfo> getAllDataList(){
        return individualWriteInfoMapper.getAllDataList();
    }
}
