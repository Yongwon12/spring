package com.example.demo.model.aws.dao;

import java.util.List;

import com.example.demo.model.aws.dto.boardwrite;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TestMapper {
    List<boardwrite> getAllDataList();
}