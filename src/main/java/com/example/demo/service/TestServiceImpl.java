package com.example.demo.service;

import java.util.List;

import com.example.demo.model.aws.dao.TestMapper;
import com.example.demo.model.aws.dto.boardwrite;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Repository
public class TestServiceImpl implements TestService {
    private final TestMapper testMapper;

    @Override
    public List<boardwrite> getAllDataList() {
        return testMapper.getAllDataList();
    }
}