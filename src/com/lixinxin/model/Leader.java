package com.lixinxin.model;

import java.io.Serializable;
import java.util.Set;

public class Leader implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private Set<Stuff> stuffs;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Set<Stuff> getStuffs() {
		return stuffs;
	}
	public void setStuffs(Set<Stuff> stuffs) {
		this.stuffs = stuffs;
	}
	@Override
	public String toString() {
		return "Leader [id=" + id + ", name=" + name + "]";
	}
	public Leader() {
		super();
	}	

}
