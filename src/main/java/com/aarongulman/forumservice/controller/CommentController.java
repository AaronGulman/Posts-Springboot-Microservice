package com.aarongulman.forumservice.controller;

import com.aarongulman.forumservice.model.Comment;
import com.aarongulman.forumservice.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/comments")
public class CommentController {

    @Autowired
    private CommentRepository commentRepository;

    @PostMapping("/addComment")
    public String addComment(@RequestBody Comment comment){
        comment.setCreatedAt(java.time.LocalDateTime.now());
        commentRepository.save(comment);
        return "Comment saved";
    }

    @GetMapping
    public Iterable<Comment> getAllComments(){
        return commentRepository.findAll();
    }
}
