package com.example.demo.domain.post;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "boardwrite")
public class PostResponse {

    private Integer id;             // PK
    private Integer userid;
    private String  title;     // 제목
    private String description;      // 내용
    private String img;       // 작성자

    private String writedate;    // 공지글 여부
    private String profileimage;    // 공지글 여부
    private String nickname;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer boardid;    // 공지글 여부
    private Integer likedcount;    // 공지글 여부
    private Integer commentcount;    // 공지글 여부


}
