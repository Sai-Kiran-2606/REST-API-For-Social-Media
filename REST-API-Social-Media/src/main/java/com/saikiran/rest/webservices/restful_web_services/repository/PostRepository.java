package com.saikiran.rest.webservices.restful_web_services.repository;

import com.saikiran.rest.webservices.restful_web_services.user.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
    public Post findById(int postId);
}
