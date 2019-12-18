package com.inner;
@FunctionalInterface
interface Calcable{
	int calc(int num);
}
class Math{
	public static int abs(int num) {
		if(num<0) {
			return -num;
		}else {
			return num;
		}
	}
}
public class E_24 {
	private static void printAbs (int num,Calcable calcable) {
		System.out.println(calcable.calc(num));
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		printAbs(-10, n->Math.abs(n));
		printAbs(-10,Math::abs);
	}

}
