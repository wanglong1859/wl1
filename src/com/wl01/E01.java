package com.wl01;

public class E01 {
	public static void main(String[] args) {
		//自动类型转换:隐式类型转换  从小类型到大类型
		byte b=3;
		int i=b;
		System.out.println(i);
		//强制类型装换:显示类型装换  从小类型到大类型
		//一定要加上(小类型)  ()是强制类型装换运算符
		int i1=3;
		byte b1=(byte) i1;
		System.out.println(b1);
		
	}

}
