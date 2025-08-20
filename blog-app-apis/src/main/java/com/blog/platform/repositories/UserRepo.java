package com.blog.platform.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.blog.platform.entities.User;


public interface UserRepo extends JpaRepository<User,Integer>{

}
