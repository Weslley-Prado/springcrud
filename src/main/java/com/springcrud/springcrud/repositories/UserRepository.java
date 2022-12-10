package com.springcrud.springcrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springcrud.springcrud.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
