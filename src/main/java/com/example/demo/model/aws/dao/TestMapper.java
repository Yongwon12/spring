package com.example.demo.model.aws.dao;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.aws.dto.Portfolio;

import com.google.gson.JsonArray;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface TestMapper {
    @Autowired
    ArrayList<Portfolio> getAllDataList();
}