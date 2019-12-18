package com.chapter4;


class Animal{
	void shout() {
		System.out.println("动物发出叫声");
	}
	//Field:成员变量
	String name;
	//Method:成员方法
}
class Dog extends Animal{
	void shout() {
		System.out.println("汪汪~");
	}
	//继承了Animal类所有的成员变量和成员方法
	public void printName() {
		System.out.println("name="+name);
	}
}
//定义测试类                                       
public class E_01 {
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.name="哈士奇";
		dog.printName();
		dog.shout();
	}
	class A{}
	class B extends A{}
	class C extends B{}
	
}