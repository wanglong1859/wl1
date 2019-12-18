package com.yichang;

public class E_28 {

	public static int divide(int x,int y) {
		// TODO 自动生成的方法存根
		int result=x/y;
		return result;
	}
	public static void main(String[] args) {
		try {
			int result=divide(4, 2);
			System.out.println(result);	
		} catch (Exception e) {
			System.out.println("捕获到运行时的异常信息"+e.getMessage());
		}
	
	}
}
