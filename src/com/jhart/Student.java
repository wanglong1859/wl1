package com.jhart;

public class Student extends Person{
	//作用范围修饰符
	//private:类可见性，只在本类中可使用，其他地方访问都是非法的
	//没有作用范围可修饰符:包可见性  只在本包中可以使用，其他地方访问都是非法的
	//protected:子类可见性,  只在本 包或其他包的子类中可以使用，其他地方的访问都是非法的
	//public:公共访问级别,任何位置都可以访问
	//类的成员变量一般是private  这叫类的封装
	//如果要使用成员变量,使用public+类名(){}
	public String name;//姓名属性
	public int score;//成绩属性
	public Student (){}
	//
	public Student(String mz,int cj) {
		this.name=mz;
		this.score=cj;
	}
	public String getName() {
		return name;
	}
	//读取姓名
	public void setName(String name) {
		this.name = name;
	}
	//设置姓名
	public int getScore() {
		return score;
	}
	//读取成绩
	public void setScore(int score) {
		this.score = score;
	}
	//设置成绩
}
