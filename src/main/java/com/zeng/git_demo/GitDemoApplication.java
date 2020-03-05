package com.zeng.git_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitDemoApplication.class, args);
	}


	@RequestMapping(value="/hello" , method= RequestMethod.GET)
	public String hello(){
		return "hello ......";
	}

}
