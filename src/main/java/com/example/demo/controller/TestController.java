package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.aws.dto.Portfolio;
import com.example.demo.service.TestService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@Controller
public class TestController {
    private final TestService testService;



    @PostMapping("/hello")
    public Portfolio portfolio(@RequestBody Portfolio req) {
        Portfolio portfolio = Portfolio.builder()
                .id(req.getId())
                .userid(req.getUserid())
                .title(req.getTitle())
                .description(req.getDescription())
                .img(req.getImg())
                .writedate(req.getWritedate())
                .profileimage(req.getProfileimage())
                .nickname(req.getNickname())
                .likedcount(req.getLikedcount())
                .commentcount(req.getCommentcount())
                .build();
        return portfolio;
    }

    @GetMapping("/test")
    public List<Portfolio> test() {

        return testService.getAllDataList();
    }
}