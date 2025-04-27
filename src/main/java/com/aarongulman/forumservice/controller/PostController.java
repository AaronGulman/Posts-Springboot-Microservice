package com.aarongulman.forumservice.controller;

import jakarta.persistence.PostUpdate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {
    @RequestMapping("/posts/{id}")
    @ResponseBody

    public String post(){
        return "Post";
    }

    @RequestMapping("/posts")
    @ResponseBody
    public String posts(){
        return "Posts";
    }

}

