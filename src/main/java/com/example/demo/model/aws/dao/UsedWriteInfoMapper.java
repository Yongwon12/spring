package com.example.demo.model.aws.dao;

import com.example.demo.model.aws.dto.UsedWriteInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UsedWriteInfoMapper {
    List<UsedWriteInfo> getAllDataList();
}