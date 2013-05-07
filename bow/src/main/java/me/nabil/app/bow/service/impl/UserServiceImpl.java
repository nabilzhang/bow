package me.nabil.app.bow.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.nabil.app.bow.dao.UserDao;
import me.nabil.app.bow.entity.User;
import me.nabil.app.bow.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public User checkLogin(User user) {
		List<User> users = userDao.getByName(user.getName());
		if (null != users && users.size() > 0) {
			return users.get(0);
		}
		return null;
	}

}
