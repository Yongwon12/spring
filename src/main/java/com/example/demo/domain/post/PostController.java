package com.example.demo.domain.post;

import com.example.demo.model.aws.vo.BoardWriteInfoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("api")
public class PostController{
    @Autowired
    private PostService postService;
    @Autowired
    private PostRepository postRepository;

    @PostMapping("/boardwrite")
    public PostRequest boardwrite(@RequestBody PostRequest req) {
        PostRequest postRequest = PostRequest.builder()
                .id(req.getId())
                .userid(req.getUserid())
                .title(req.getTitle())
                .description(req.getDescription())
                .img(req.getImg())
                .writedate(req.getWritedate())
                .profileimage(req.getProfileimage())
                .nickname(req.getNickname())
                .likedcount(req.getLikedcount())
                .commentcount(req.getCommentcount())
                .build();

        return postService.insert(postRequest);
    }

    @GetMapping("/boardwrite")
    public ResponseEntity<?> boardwrite(@RequestParam(required = false) Integer id) {
        Map<String, Object> obj = new HashMap<>();
        List<PostRequest> boardwrite = postRepository.findAll();
        obj.put("boardwrite", boardwrite);
        return new ResponseEntity<>(obj, HttpStatus.OK);

    }

}
