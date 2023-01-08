package com.example.demo.model.aws.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardWriteInfo {
    private String id;

    private String userid;

    private String title;

    private String description;

    private String img;

    private String writedate;
    private String profileimage;
    private String nickname;
    private String boardid;
    private String likedcount;
    private String commentcount;

}