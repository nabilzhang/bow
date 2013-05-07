package me.nabil.app.bow.dao;

import java.util.List;

import me.nabil.app.bow.entity.User;

public interface UserDao extends BaseDao<User>{
	List<User> getByName(String name);
}
