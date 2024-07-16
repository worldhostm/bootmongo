package com.dev.dev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.RestController;

import com.dev.dev.repositories.MemberRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@EnableMongoRepositories
@SpringBootApplication
public class DevApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevApplication.class, args);
	}
	
	@RestController
	/**
	 * Helloworld
	 */
	public class Helloworld {
    
    @Autowired
    private MemberRepository memberRepository;
		@GetMapping("/")
		public String greet() {
      System.out.println(memberRepository.findAll());
			return "Hello~";
		}
			
	}
}
