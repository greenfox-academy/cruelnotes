package com.spring.reddit;

import com.spring.reddit.model.Post;
import com.spring.reddit.repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication implements CommandLineRunner {

	@Autowired
	PostRepo postRepo;

	public static void main(String[] args) {
		SpringApplication.run(RedditApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
       postRepo.save(new Post("Post for demo"));
	}
}
    