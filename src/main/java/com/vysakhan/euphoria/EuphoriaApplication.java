package com.vysakhan.euphoria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EuphoriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EuphoriaApplication.class, args);
	}
	
	@GetMapping("/")
	public String getCookBook(){
	    return "The-Cook-Book";
	}

}
