package com.aarongulman.forumservice.exceptions;

public class PostNotFoundException extends RuntimeException{
    public PostNotFoundException(Long id){
        super("Could not find post "+ id);
    }
}
