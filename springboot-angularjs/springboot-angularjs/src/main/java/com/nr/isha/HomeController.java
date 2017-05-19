package com.nr.isha;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.spi.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nr.isha.hibernate.repository.UserInterface;
import com.nr.isha.service.UserService;

 

@RestController
public class HomeController {

	@Autowired
	UserService userService;
	/*@Autowired
	UserInterface userInterface;*/
	
	 @RequestMapping(value = "/hello1")  
	 	 public List<User> getTopic(){
		return userService.getAlltopic();
	 }
	 
	/* 
	 @RequestMapping(value="/hello1/{id}")
	 public User getTopicid(@PathVariable("id")Long id){
		return  userService.gettopic(id);
	 }*/
	 
	 @RequestMapping(method=RequestMethod.POST, value="/hello1")
	 public void addUser(@RequestBody User user){
		 System.out.println("HomeController->"+user);
		 userService.add(user);
	 }
	 
	 @RequestMapping(method=RequestMethod.GET, value="/hello1/{name}/{password}")
	 public ResponseEntity<?> isUserExist(@PathVariable("name")String name,@PathVariable("password")String password){
		 //System.out.println("HomeController->"+user);
		 
		/*User u= userService.isUserExistName(name,password);
		 
		System.out.println("user and passwod is existed");
		 
		*/
		  User u=userService.findUser(name, password);
		 
		if(u==null){
			 
		 return new ResponseEntity("Unable to upate. User with id " + name+password + " not found.",HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<User>(u,HttpStatus.OK); 
		
	 }
	 
	 
	/* @RequestMapping(method=RequestMethod.GET, value="/hello1/{user}")
	 public ResponseEntity<?> isUserExist(@RequestBody User user){
		 System.out.println("HomeController->"+user);
		boolean find= userService.isUserExist(user);
		if(!find){
			return new ResponseEntity("Unable to upate. User with id " + user.getId() + " not found.",HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<User>(user, HttpStatus.OK);
	 }
	 */
	 
	 
	/* @RequestMapping(method=RequestMethod.PUT, value="/hello1/{id}")
	 public void update(@RequestBody User user,@PathVariable("id")Long id){
		 System.out.println(user);
		 User user1=userService.gettopic(id);
		 User usertemp=new User();
		 usertemp.setId(user1.id);
		 usertemp.setName(user1.name);
		 usertemp.setPassword(user1.password);
		 userService.update(usertemp);
	 }*/
	 
	 @RequestMapping(method=RequestMethod.DELETE,value="/hello1/{id}")
	 public void delete(@PathVariable("id")Long id){
		  userService.delete(id);
	 }
}
