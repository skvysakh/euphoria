package com.vysakhan.euphoria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EuphoriaApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(EuphoriaApplication.class, args);
	}
	
	 @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(EuphoriaApplication.class);
    }
	
	@GetMapping("/")
	public String getCookBook(){
	    return "The-Cook-Book";
	}

}
