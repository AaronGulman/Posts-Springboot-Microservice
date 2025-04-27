package com.aarongulman.forumservice;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ForumserviceApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(ForumserviceApplication.class);
		application.setBannerMode(Banner.Mode.OFF);


		application.run(args);
	}

}
