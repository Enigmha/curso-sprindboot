package com.devsuperior.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	 

}
