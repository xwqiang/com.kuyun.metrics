package com.kuyun.matics;

public class BasicMatrics implements Metrics{
	private static final long serialVersionUID = 1L;
	protected String name ;
	protected String value;
	@Override
	public String key() {
		return name;
	}
	@Override
	public String value() {
		return value;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setValue(String value){
		this.value = value;
	}
	
}