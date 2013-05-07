package me.nabil.app.bow.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="xt_procatalog")
public class ProCatalog implements Serializable {
	private static final long serialVersionUID = 7143353809844147594L;
	@Id
	@GeneratedValue
	private int id;
	private String catalognumber;
	private String name;
	private int parentid;
	private int state;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCatalognumber() {
		return catalognumber;
	}
	public void setCatalognumber(String catalognumber) {
		this.catalognumber = catalognumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getParentid() {
		return parentid;
	}
	public void setParentid(int parentid) {
		this.parentid = parentid;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
}
