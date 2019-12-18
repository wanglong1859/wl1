package com.wl01;

public class T6 {
	public static void main(String [] args) {
		//在静态方法里，只能调用本类的静态方法，不能调用非静态方法
		//针对求和方法调用
		int sum1=Overload.add(1,2);
		int sum2=Overload.add(3,4,7);
		double sum3=Overload.add(0.2,5.3);
		//打印求和的结果		
		System.out.println("sum1="+sum1);
		System.out.println("sum2="+sum2);
		System.out.println("sum3="+sum3);
	}
}
