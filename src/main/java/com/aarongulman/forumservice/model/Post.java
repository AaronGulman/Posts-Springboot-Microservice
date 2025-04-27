package com.aarongulman.forumservice.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String authorName;
    private String message;
    private String mediaUrl;
    private String mediaType;

    LocalDateTime createdAt;
    
    public Post(){
    }

   public Post(String authorName , String message ,String mediaUrl,String mediaType,LocalDateTime createdAt){
       this.authorName = authorName;
       this.message = message;
       this.mediaUrl = mediaUrl;
       this.mediaType = mediaType;
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

   public String getMediaUrl(){
        return mediaUrl;
   }

   public String getMediaType(){
         return mediaType;
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

    public void setMediaUrl(String mediaUrl){
        this.mediaUrl = mediaUrl;
    }

    public void setMediaType(String mediaType){
        this.mediaType = mediaType;
    }

    public void setCreatedAt(LocalDateTime createdAt){
        this.createdAt = createdAt;
    }



}
