package com.aarongulman.forumservice.exceptions;

public class CommentNotFoundException extends RuntimeException{
    public CommentNotFoundException(Long id){
        super("Comment not found: "+id);
    }
}
