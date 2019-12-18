package com.Interface_;

//接口关键字:interface
interface Animal{
	//接口的成员变量声明时,可以省略public static final三个关键字
	int ID=1;
	//接口的普通成员方法声明时可以省略public abstract两个关键字
	void shout();
	//接口内不能有普通方法,可以有静态方法
	static int getID() {
		return Animal.ID;
	}
}
interface LandAnimal extends Animal{
	void run();
}
//定义Dog类继承抽象类Animal
class Dog implements LandAnimal{
	@Override
	public void run() {
		System.out.println("小狗在跑");
	}
	//实现抽象方法shout（），编写方法体
	public void shout() {
		System.out.println("汪汪~~~");
	}
}
//定义测试类
public class E_13 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println(Animal.getID());
		Dog dog =new Dog();
		dog.run();
		dog.shout();
	}

}
