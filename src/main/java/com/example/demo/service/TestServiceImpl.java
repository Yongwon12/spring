package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.aws.dao.TestMapper;
import com.example.demo.model.aws.dto.Portfolio;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TestServiceImpl implements TestService {
    private final TestMapper testMapper;

    @Override
    public ArrayList<Portfolio> getAllDataList() {
        return testMapper.getAllDataList();
    }
}