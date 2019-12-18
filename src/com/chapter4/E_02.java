package com.chapter4;

class Animal_1{
	public Animal_1(String name) {
		System.out.println("我是一只"+name);
	}
}
class Dog_1 extends Animal_1{
	public  Dog_1() {
		super("京哈吧");
	}
}
public class E_02 {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Dog_1 dog=new Dog_1();

	}

}
