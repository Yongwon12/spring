package com.example.demo.model.aws.vo;

import lombok.*;

@Data
@Builder
public class BoardWriteInfoEntity {
    private Integer id;

    private Integer userid;

    private String title;

    private String description;

    private String img;

    private String writedate;
    private String profileimage;
    private String nickname;

    private Integer boardid;
    private Integer likedcount;
    private Integer commentcount;
}