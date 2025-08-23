package com.blog.platform.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blog.platform.entities.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category,Integer> {

}
