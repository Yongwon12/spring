package com.example.demo.model.aws.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class boardwrite {
    private String id;

    private String username;

    private String password;

    private String email;

    private String nickname;

    private String mobile;
    private String create_date;
    private String modify_date;
    private String birth;
    private String userimage;
    private String gender;
    private String bestcategory;
    private String shortinfo;
}