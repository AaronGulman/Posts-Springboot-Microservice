package com.aarongulman.forumservice.model;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "comments")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String authorName;
    private String message;
    private LocalDateTime createdAt;

    public Comment(){
    }

    public Comment(String authorName,String message,LocalDateTime createdAt){
        this.authorName = authorName;
        this.message = message;
        this.createdAt = createdAt;
    }

    public Long getId(){
        return id;
    }

    public String getAuthorName(){
        return authorName;
    }

    public String getMessage(){
        return message;
    }

    public LocalDateTime getCreatedAt(){
        return createdAt;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setAuthorName(String authorName){
        this.authorName = authorName;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public void setCreatedAt(LocalDateTime createdAt){
        this.createdAt = createdAt;
    }




}
