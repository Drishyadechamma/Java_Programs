package com.atria.day3;

public class EncapsulationExample {
	
	private int serialNum; // while doing encapsulation it should also be in private
	private String name;
	private int age;
	public int getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "EncapsulationExample [serialNum=" + serialNum + ", name=" + name + ", age=" + age + "]";
	}



	}
	


