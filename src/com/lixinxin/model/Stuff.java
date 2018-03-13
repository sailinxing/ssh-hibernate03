package com.lixinxin.model;

import java.io.Serializable;
import java.util.Set;

public class Stuff implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private Integer age;
	private Dept dept;
	private IC card;
	private IC card1;
	private Set<Leader> leaders;
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	
	public IC getCard() {
		return card;
	}
	public void setCard(IC card) {
		this.card = card;
	}
	
	public IC getCard1() {
		return card1;
	}
	public void setCard1(IC card1) {
		this.card1 = card1;
	}	
	public Set<Leader> getLeaders() {
		return leaders;
	}
	public void setLeaders(Set<Leader> leaders) {
		this.leaders = leaders;
	}
	@Override
	public String toString() {
		return "Stuff [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	public Stuff() {
		super();
	}
	
}
