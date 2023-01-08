package com.example.demo.service;

import java.util.List;

import com.example.demo.model.aws.dto.BoardWriteInfo;
import org.springframework.stereotype.Service;

@Service
public interface BoardWriteInfoService {
    List<BoardWriteInfo> getAllDataList();
}