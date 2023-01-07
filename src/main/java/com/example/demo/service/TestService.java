package com.example.demo.service;

import java.util.List;

import com.example.demo.model.aws.dto.boardwrite;
import org.springframework.stereotype.Service;

@Service
public interface TestService {
    List<boardwrite> getAllDataList();
}