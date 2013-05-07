package me.nabil.app.bow.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import me.nabil.app.bow.dao.BaseDao;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class BaseDaoImpl<T> implements BaseDao<T>{
	private Class<T> entityClass;
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	
	
	private Logger logger = null;
	public Logger getLogger(){
		if(null == logger){
			logger = org.slf4j.LoggerFactory.getLogger(this.getClass());
		}
		return logger;
	}
	
	
	@SuppressWarnings("unchecked")
	public BaseDaoImpl(){
		Type genType = getClass().getGenericSuperclass();
		Type[] params = ((ParameterizedType)genType).getActualTypeArguments();
		entityClass=(Class<T>)params[0];
	}
	/**----------------------**/
	@Override
	public T get(Serializable id) {
		return (T)getHibernateTemplate().get(entityClass, id);
	}

	@Override
	public void save(T entity) {
		getHibernateTemplate().save(entity);
	}

	@Override
	public void delete(T entity) {
		getHibernateTemplate().delete(entity);
	}

	@Override
	public void update(T entity) {
		getHibernateTemplate().update(entity);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> find(String hql) {
		return getHibernateTemplate().find(hql);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> find(String hql, Object... params) {
		return getHibernateTemplate().find(hql, params);
	}
}
