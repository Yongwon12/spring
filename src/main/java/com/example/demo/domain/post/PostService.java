package com.example.demo.domain.post;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.events.Event;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public PostRequest insert(PostRequest postRequest) {
        return postRepository.save(postRequest);
    }
    public List<PostRequest> findAll(){
        return postRepository.findAll();
    }

}
