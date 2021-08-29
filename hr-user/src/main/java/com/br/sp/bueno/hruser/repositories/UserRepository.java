package com.br.sp.bueno.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.sp.bueno.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
	
}