package com.nr.isha.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;

import com.nr.isha.User;
 
import com.nr.isha.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	 JdbcTemplate jtemp;
	 
	@Autowired
		UserRepository userRepository;
	 
	 
	public List<User> getAlltopic(){
		 return (List<User>) userRepository.findAll();
	 }
	
	public Optional<User> gettopic(Long id){
		
		return userRepository.findById(id);
	//List<User>list=(List<User>)userRepository.findById(id);
 
		  
	}
	
	public void add(User u){
		System.out.println("userService->"+u);
		userRepository.save(u);
	}

	public void update(User user) {
		System.out.println("UserSErvice->id"+user);
		 
		userRepository.save(user);
		 
		  /*int count=0;
		 for(User u:l){
			 if(u.getId()==id){
				 l.set(count,user);
				 
			 }count++;
		 }*/
		 
		
	}

	public void delete(Long id) {
		userRepository.deleteById(id);
		/*int count=0;
		  for(int i=0;i<l.size();i++){
			  
		  }*/
		 
	}
	public User findByName(String name) {
		return userRepository.findByName(name);
	}

	/*public User findUser(String name,String password){
		String query="find user where name=? and password=?";
		 List li=htemp.find(query,name,password);
		 User user=new User();
		 for(Object obj:li){
			User u=(User)obj;
			 user.setId(u.getId());
			 user.setName(u.getName());
			 user.setPassword(u.getPassword());
			 
		 }
		 if(user!=null){
				return user;
		 }
				return null;
			}

	
	;*/
	 
	public User findUser(String name, String password) {
		 
 

User user=jtemp.queryForObject("select * from user where name=? and password=?",
        new Object[]{name,password}, new UserRowMapper());

 
if(user!=null){
		return user;
}
		return null;
	}

 
 
	
	public User isUserExistName(String name,String password) {
		return null;
		/*User usertempuser=userRepository.verifyUserinfo(name, password);
		//User usertemppasword=userRepository.findByName(user.getPassword());
		 if(usertempuser!=null){
			 return new User(usertempuser.getId(),usertempuser.getName(),usertempuser.getPassword());
		 }else{
			 return null;
		 }*/
		
	}
/*public boolean isUserExistPassword(String password) {
		
		   
		User usertemppasword=userRepository.findByName(password);
		if(usertemppasword!=null){
			System.out.println("userService->isUserExistPassword->exist"+password);
			return true;
		}else return false;
		 
		
	}*/
}
class UserRowMapper implements RowMapper<User>
{
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();
        user.setId(rs.getLong("id"));
        user.setName(rs.getString("name"));
        user.setPassword(rs.getString("password"));
        return user;
    }

	 
}

