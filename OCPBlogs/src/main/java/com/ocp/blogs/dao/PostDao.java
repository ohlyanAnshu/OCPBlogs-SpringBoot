package com.ocp.blogs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ocp.blogs.model.Post;

@Repository
public interface PostDao extends JpaRepository<Post, Long> {

}
