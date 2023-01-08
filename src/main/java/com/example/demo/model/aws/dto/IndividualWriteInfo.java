package com.example.demo.model.aws.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IndividualWriteInfo {

    private String id;

    private String local;

    private String date;

    private String title;

    private String description;

    private String gender;
    private String userimage;
    private String userid;
    private String writedate;
    private String maxage;
    private String minage;
    private String nickname;
    private String individualid;
    private String likedcount;
    private String commentcount;
}
