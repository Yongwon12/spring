package com.example.demo.model.aws.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsedWriteInfo {
    private String id;

    private String local;

    private String title;

    private String description;

    private String usedimage1;

    private String price;
    private String userid;
    private String writedate;
    private String nickname;
    private String usedid;
    private String usedimage2;
    private String usedimage3;
    private String usedimage4;
    private String usedimage5;
    private String likedcount;
    private String commentcount;


}