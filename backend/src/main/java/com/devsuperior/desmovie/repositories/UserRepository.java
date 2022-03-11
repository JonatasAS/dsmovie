package com.devsuperior.desmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.desmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
