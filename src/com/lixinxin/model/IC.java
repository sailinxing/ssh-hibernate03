package com.lixinxin.model;

import java.io.Serializable;

public class IC implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String cardName;
	private Stuff stuff;
	private Stuff stuff1;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public Stuff getStuff() {
		return stuff;
	}
	public void setStuff(Stuff stuff) {
		this.stuff = stuff;
	}
	
	public Stuff getStuff1() {
		return stuff1;
	}
	public void setStuff1(Stuff stuff1) {
		this.stuff1 = stuff1;
	}
	@Override
	public String toString() {
		return "IC [id=" + id + ", cardName=" + cardName + "]";
	}
	public IC() {
		super();
	}
	
}
