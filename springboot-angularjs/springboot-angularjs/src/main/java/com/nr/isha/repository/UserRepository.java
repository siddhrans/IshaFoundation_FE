package com.nr.isha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nr.isha.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	User findByName(String name);
	
	 
}
