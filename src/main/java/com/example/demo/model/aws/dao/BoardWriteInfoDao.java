package com.example.demo.model.aws.dao;

import java.util.List;

import com.example.demo.model.aws.vo.BoardWriteInfoEntity;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface BoardWriteInfoDao {
     public List<BoardWriteInfoEntity> listBoard1();
     public List<BoardWriteInfoEntity> listBoard2();
     public List<BoardWriteInfoEntity> listBoard3();
     public List<BoardWriteInfoEntity> listBoard4();
     public List<BoardWriteInfoEntity> listBoard5();
     public List<BoardWriteInfoEntity> listBoard6();
     public List<BoardWriteInfoEntity> listBoard7();
     public List<BoardWriteInfoEntity> listBoard8();
     public List<BoardWriteInfoEntity> listBoard9();
     public List<BoardWriteInfoEntity> listBoard10();


}