package com.lixinxin.model;

import java.io.Serializable;
import java.util.Set;

public class Dept implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private Set<Stuff> stuffSet;
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
	public Set<Stuff> getStuffSet() {
		return stuffSet;
	}
	public void setStuffSet(Set<Stuff> stuffSet) {
		this.stuffSet = stuffSet;
	}
	@Override
	public String toString() {
		return "Dept [id=" + id + ", name=" + name + "]";
	}
	public Dept() {
		super();
	}
	
}
