package me.nabil.app.bow.dao.impl;

import java.util.List;

import me.nabil.app.bow.dao.UserDao;
import me.nabil.app.bow.entity.User;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

	@Override
	public List<User> getByName(String name) {
		return (List<User>)this.find("from User u where u.name = ?", name);
	}

}
