package com.example.demo.service;

import com.example.demo.model.aws.dto.UsedWriteInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsedWriteInfoService {
    List<UsedWriteInfo> getAllDataList();
}