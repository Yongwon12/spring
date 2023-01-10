package com.example.demo.domain.post;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.*;
import org.springframework.beans.factory.annotation.Value;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "boardwrite")
public class PostRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer boardid;
    private Integer id;
    private Integer userid;
    private String title;        // 제목
    private String description;      // 내용
    private String img;       // 작성자
    private String writedate;   // 공지글 여부
    private String profileimage;    // 공지글 여부
    private String nickname;    // 공지글 여부
    private String likedcount;    // 공지글 여부
    private String commentcount;    // 공지글 여부


}

