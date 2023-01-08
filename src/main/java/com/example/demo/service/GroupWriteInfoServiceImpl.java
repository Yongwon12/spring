package com.example.demo.service;


import com.example.demo.model.aws.dao.GroupWriteInfoMapper;

import com.example.demo.model.aws.dto.GroupWriteInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Repository
public class GroupWriteInfoServiceImpl implements GroupWriteInfoService {
    private final GroupWriteInfoMapper groupWriteInfoMapper;

    @Override
    public List<GroupWriteInfo> getAllDataList() {

        return groupWriteInfoMapper.getAllDataList();
    }
}