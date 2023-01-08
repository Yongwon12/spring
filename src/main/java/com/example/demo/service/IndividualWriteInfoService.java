package com.example.demo.service;

import com.example.demo.model.aws.dto.IndividualWriteInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IndividualWriteInfoService {
    List<IndividualWriteInfo> getAllDataList();
}
