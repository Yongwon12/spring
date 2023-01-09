package com.example.demo.model.aws.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Portfolio {

    private Integer id;

    private Integer userid;

    private String title;

    private String description;

    private String img;

    private String writedate;
    private String profileimage;
    private String nickname;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer boardid;
    private Integer likedcount;
    private Integer commentcount;
}