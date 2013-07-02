package edu.rit.stella.bo;

import java.util.List;

import edu.rit.stella.entity.User;

public interface UserBO extends AbstractBO<User, String>{
	User findByUserName(String userName);
   
    List<User> findUsers(String user);
    
  
    
}
