package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.aws.dto.*;
import com.example.demo.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@Controller
class MainController {
    private final BoardWriteInfoService boardWriteInfoService;
    private final IndividualWriteInfoService individualWriteInfoService;
    private final GroupWriteInfoService groupWriteInfoService;
    private final UsedWriteInfoService usedWriteInfoService;

    @PostMapping("/boardwriteinfo")
    public List<BoardWriteInfo> boardWriteInfo() {

        return boardWriteInfoService.getAllDataList();
    }


    @PostMapping("/individualwriteinfo")
    public List<IndividualWriteInfo> individualWriteInfo(){
        return individualWriteInfoService.getAllDataList();
    }
    @PostMapping("/groupwriteinfo")
    public List<GroupWriteInfo> GroupWriteInfo(){
        return groupWriteInfoService.getAllDataList();
    }
    @PostMapping("/usedwriteinfo")
    public List<UsedWriteInfo> UsedWriteInfo(){
        return usedWriteInfoService.getAllDataList();
    }

}