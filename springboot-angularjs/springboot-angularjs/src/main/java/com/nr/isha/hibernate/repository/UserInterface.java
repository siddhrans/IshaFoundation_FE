package com.nr.isha.hibernate.repository;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.nr.isha.User;

 

@Service
public interface UserInterface {

	User findUser(String name,String password);
}
