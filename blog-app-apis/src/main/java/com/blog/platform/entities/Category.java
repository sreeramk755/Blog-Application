package com.blog.platform.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="categories")
@Getter
@Setter
@NoArgsConstructor
public class Category{
	
	@Id
	@GeneratedValue
	private int categoryId;
	
	@Column(name="title",nullable=false,length=100)
	private String categoryTitle;
	
	@Column(name="description")
	private String categoryDescription;
}