package edu.rit.stella.dao.impl;

import java.util.List;

import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import edu.rit.stella.dao.UserDAO;
import edu.rit.stella.entity.User;


@Repository
public class UserDAOImpl extends AbstractDAOImpl<User, String> implements UserDAO {

    protected UserDAOImpl() {
        super(User.class);
    }

    
    public void saveUser(User user) {
        saveOrUpdate(user);
    }

    public List<User> findUsers(String userName) {
        return findByCriteria(Restrictions.like("userName", userName, MatchMode.START));
    }
}
