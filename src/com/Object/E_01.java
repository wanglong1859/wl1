package com.Object;
class Animal{
	void shout() {
		System.out.println("动物叫！");
	}
	@Override
	public String toString() {
		return "只是一只动物";
	}
}
public class E_01 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
	Animal animal=new Animal();
	System.out.println(animal.toString());

	}

}
