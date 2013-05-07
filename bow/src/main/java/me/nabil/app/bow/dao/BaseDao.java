package me.nabil.app.bow.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T> {
	T get(Serializable id);
	
	void save(T entity);
	
	void delete(T entity);
	
	void update(T entity);
	
	public List<T> find(String hql);
	
	public List<T> find(String hql, Object... params);
	
}
