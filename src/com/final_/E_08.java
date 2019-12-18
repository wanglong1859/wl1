package com.final_;

class Animal{
	//如果一个成员变量被final修饰，则该变量在本类中不能再次被赋值
	final String name="动物";
	public void shout() {}
	//重写Object类的toString()方法
	@Override
	public String toString() {
		return "只是一只动物";
	}
}

class Dog extends Animal{
	@Override
	public void shout() {}
	//重写Animal类的toString()方法
	@Override
	public String toString() {
		return "这是一只小狗";
	}
}
public class E_08 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Dog dog=new Dog();
		System.out.println(dog.toString());
	}

}
