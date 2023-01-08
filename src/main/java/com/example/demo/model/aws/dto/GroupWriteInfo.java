package com.example.demo.model.aws.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GroupWriteInfo {
    private String id;

    private String local;

    private String title;
    private String line;

    private String description;

    private String peoplenum;

    private String gender;
    private String minage;
    private String titleimage;
    private String userid;
    private String maxage;
    private String writedate;
    private String peoplenownum;
    private String nickname;
    private String groupid;
    private String once;
    private String commentcount;

}