package com.pj.springsecurityjpa;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pj.springsecurityjpa.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findByUserName(String userName);
	
	Optional<User> findById(int id);

}
