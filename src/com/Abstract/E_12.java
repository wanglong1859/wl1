package com.Abstract;
//定义抽象类
abstract class Animal{
	public abstract void shout();
}
//定义Dog类继承抽象类Animal
class Dog extends Animal{
	//实现抽象方法shout（），编写方法体
	public void shout() {
		System.out.println("汪汪~~~");
	}
}
//定义测试类
public class E_12 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Dog dog =new Dog();
		dog.shout();
	}

}
