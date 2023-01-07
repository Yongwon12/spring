package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.aws.dto.boardwrite;
import com.example.demo.service.TestService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@Controller
class TestController {
    private final TestService testService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/test")
    public List<boardwrite> test() {

        return testService.getAllDataList();
    }
}