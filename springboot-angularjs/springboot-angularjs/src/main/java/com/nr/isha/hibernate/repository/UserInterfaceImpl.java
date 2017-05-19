package com.nr.isha.hibernate.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.nr.isha.User;

 

@Transactional
public class UserInterfaceImpl implements UserInterface{
	
	@Autowired
	 JdbcTemplate jtemp;
	
	@Override
	public User findUser(String name, String password) {
		String query="find user where name=? and password=?";
		 
  
 
 User user=jtemp.queryForObject("select * from user where name=? and password=?",
         new Object[]{name,password}, new UserRowMapper());
 
  
 if(user!=null){
		return user;
 }
		return null;
	}

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
