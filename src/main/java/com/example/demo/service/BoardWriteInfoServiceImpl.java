package com.example.demo.service;

import java.util.List;

import com.example.demo.model.aws.dao.BoardWriteInfoMapper;
import com.example.demo.model.aws.dto.BoardWriteInfo;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Repository
public class BoardWriteInfoServiceImpl implements BoardWriteInfoService {
    private final BoardWriteInfoMapper boardWriteInfoMapper;

    @Override
    public List<BoardWriteInfo> getAllDataList() {

        return boardWriteInfoMapper.getAllDataList();
    }
}