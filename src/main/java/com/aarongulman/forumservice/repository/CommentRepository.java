package com.aarongulman.forumservice.repository;

import com.aarongulman.forumservice.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {

}
