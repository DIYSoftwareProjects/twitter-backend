package com.api.twitter.repository;

import com.api.twitter.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, String> {
    List<Comment> findByPostId(String postId);

    Long countByPostId(String postId);
}
