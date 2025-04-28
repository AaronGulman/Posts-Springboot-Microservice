package com.aarongulman.forumservice.controller;

import com.aarongulman.forumservice.model.Post;
import com.aarongulman.forumservice.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostRepository postRepository;

    @PostMapping("/add")
    public String addNewPost(@RequestBody Post post){
        post.setCreatedAt(java.time.LocalDateTime.now());
        postRepository.save(post);
        return "Saved" ;
    }

    @GetMapping
    public Iterable<Post> getAllPosts(){
        return postRepository.findAll();
    }

}

