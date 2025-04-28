package com.aarongulman.forumservice.repository;

import com.aarongulman.forumservice.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {

}
