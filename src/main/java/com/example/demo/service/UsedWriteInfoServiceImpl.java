package com.example.demo.service;

import com.example.demo.model.aws.dao.UsedWriteInfoMapper;
import com.example.demo.model.aws.dto.UsedWriteInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Repository
public class UsedWriteInfoServiceImpl implements UsedWriteInfoService {
    private final UsedWriteInfoMapper usedWriteInfoMapper;

    @Override
    public List<UsedWriteInfo> getAllDataList() {

        return usedWriteInfoMapper.getAllDataList();
    }
}