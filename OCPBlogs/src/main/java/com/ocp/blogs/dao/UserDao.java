package com.ocp.blogs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ocp.blogs.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Long>{

}
