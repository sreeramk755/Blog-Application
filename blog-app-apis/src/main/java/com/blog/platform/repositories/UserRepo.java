package com.blog.platform.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.blog.platform.entities.User;

//JpaRepository <datatype of entity,datatype of primary key>
public interface UserRepo extends JpaRepository<User,Integer>{

}
