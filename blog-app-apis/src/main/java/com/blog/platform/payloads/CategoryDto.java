package com.blog.platform.payloads;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CategoryDto {
	
	private int categoryId;
	
	@NotNull
	@Size(min=3,max=50,message="category title must be between 3 and 50 ")
	private String categoryTitle;
	
	private String categoryDescription;
}
