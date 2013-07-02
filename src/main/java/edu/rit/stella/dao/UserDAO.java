package edu.rit.stella.dao;

import java.util.List;

import edu.rit.stella.entity.User;

public interface UserDAO extends AbstractDAO<User, String>{
    void saveUser(User user);
    List<User> findUsers(String userName);

}
