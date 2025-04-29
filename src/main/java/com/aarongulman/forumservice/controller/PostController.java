package com.aarongulman.forumservice.controller;

import com.aarongulman.forumservice.exceptions.PostNotFoundException;
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

    @PutMapping("/{id}")
    Post replacePost(@RequestBody Post newPost,@PathVariable Long id){
        return postRepository.findById(id)
                .map(post -> {
                    post.setMessage(newPost.getMessage());
                    return postRepository.save(post);
                })
                .orElseGet(()->{
                    return postRepository.save(newPost);
                });
    }

    @DeleteMapping("/{id}")
    void deletePost(@PathVariable Long id){
        postRepository.deleteById(id);
    }


    @GetMapping
    public Iterable<Post> getAllPosts(){
        return postRepository.findAll();
    }

    @GetMapping("/{id}")
    Post one(@PathVariable Long id){
        return postRepository.findById(id)
                .orElseThrow(() -> new PostNotFoundException(id));
    }



}

