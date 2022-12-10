package com.springcrud.springcrud.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.springcrud.springcrud.entities.User;
import com.springcrud.springcrud.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
      @Autowired
      private UserRepository userRepository;
      
    
		public void run(String...args) throws Exception {
			User u1 = new User(null, "Weslley Prado","weslley@teste.com","7777777","123");
			User u2 = new User(null, "Laísa Prado","weslley@teste.com","7777777","123");
			
			userRepository.saveAll(Arrays.asList(u1,u2));
	}
     
}
