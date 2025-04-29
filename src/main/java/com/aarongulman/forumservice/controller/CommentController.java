package com.aarongulman.forumservice.controller;

import com.aarongulman.forumservice.exceptions.CommentNotFoundException;
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

    @PutMapping("/{id}")
    Comment replaceComment(@RequestBody Comment newComment,@PathVariable Long id){
        return commentRepository.findById(id)
                .map(comment -> {
                    comment.setMessage(newComment.getMessage());
                    return commentRepository.save(comment);
                })
                .orElseGet(()->{
                    return commentRepository.save(newComment);
                });
    }

    @GetMapping("/{id}")
    Comment one(@PathVariable Long id){
        return commentRepository.findById(id)
                .orElseThrow(()->new CommentNotFoundException(id));
    }

    @DeleteMapping("/id")
    void deleteComment(@PathVariable Long id){
        commentRepository.deleteById(id);
    }






}
