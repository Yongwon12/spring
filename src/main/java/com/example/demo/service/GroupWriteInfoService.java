package com.example.demo.service;

import com.example.demo.model.aws.dto.GroupWriteInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GroupWriteInfoService {
    List<GroupWriteInfo> getAllDataList();
}