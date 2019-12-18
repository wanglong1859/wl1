package com.jhart;

public class Teacher extends Person{
	public  String id;
	public  String name;
	public  int age;
	public String getId() {
		return id;
	}
	public Teacher() {
		super();
	}
	public Teacher(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void setId(String id) {
		this.id = id;
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
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
