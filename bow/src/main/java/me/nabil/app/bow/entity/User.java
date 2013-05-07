package me.nabil.app.bow.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="xt_user")
public class User extends BaseEntity {
	private static final long serialVersionUID = -6041135627429560855L;
	@Id
	@GeneratedValue
	/**
	 * 用户号
	 */
	private int id;
	/**
	 * 用户名，用于登录
	 */
	private String name;
	/**
	 * 用户密码
	 */
	private String password;
	/**
	 * 用户对应员工号码
	 */
	private int personnelid;
	/**
	 * 用户所在用户组号
	 */
	private int groupid;
	/**
	 * 状态
	 */
	private int state;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}	
	
	public int getPersonnelid() {
		return personnelid;
	}
	public void setPersonnelid(int personnelid) {
		this.personnelid = personnelid;
	}
	public int getGroupid() {
		return groupid;
	}
	public void setGroupid(int groupid) {
		this.groupid = groupid;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
}
