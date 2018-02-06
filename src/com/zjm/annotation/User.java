package com.zjm.annotation;

public class User {

	private String name;
	
	private String age;

	public String getName() {
		return name;
	}

	@Init(value="jack")
	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	@Init(value="20")
	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "[name:"+name + ",age:" + age + "]" ;
	}
	
	
	
}
