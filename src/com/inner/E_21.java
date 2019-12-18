package com.inner;
@FunctionalInterface
interface Animal{
	void shout();
}
interface Calculate{
	int sum(int a,int b);
}
public class E_21 {
	
	public static void main(String[] args) {
		String name="小花";
		//定义匿名内部类作为参数传递给animalShout()方法
		animalShout(new Animal() {
			public void shout() {
				//JDK8开始，局部内部类，匿名内部类，匿名内部类可以访问非final的局部变量
				System.out.println(name+"喵喵...");
			}
		});
		//第三种方式:用lambda表达式调用shout方法
		animalShout(()->System.out.println("aow..."));
		showSum(5,15,(x,y)->x+y);
	}
	private static void showSum(int x, int y, Calculate calculate) {
		// TODO 自动生成的方法存根
		System.out.println(x+"+"+y+"的和为:"+calculate.sum(x,y));
	}
	//定义静态方法animalshout(),接收借口类型参数
	private static void animalShout(Animal an) {
		// TODO 自动生成的方法存根
		an.shout();			//调用传入对象an的shout()方法
	}

}
