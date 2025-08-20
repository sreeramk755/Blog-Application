package com.blog.platform;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.blog.platform.repositories.UserRepo;

@SpringBootTest
class BlogAppApisApplicationTests {

	@Autowired
	private UserRepo userRepo;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void repoTest() {
		String classname=this.userRepo.getClass().getName();
		String packagename=this.userRepo.getClass().getPackageName();
		System.out.println("class- "+ classname);
		System.out.println("package- "+ packagename);
	}

}
