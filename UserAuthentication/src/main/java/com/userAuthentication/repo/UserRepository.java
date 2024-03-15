package com.userAuthentication.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userAuthentication.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByUserName(String name);
	
}
