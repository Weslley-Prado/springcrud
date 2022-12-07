package com.springcrud.springcrud.resources;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcrud.springcrud.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	@GetMapping
	public ResponseEntity<User>findAll(){
		User userTeste = new User(1L, "Weslley", "weslley@teste.com","777777","1234");
		return ResponseEntity.ok().body(userTeste);
	}

}
