package com.api;

public class Jssj {

	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();
		@SuppressWarnings("unused")
		int sum=0;
		for(int i=0;i<100000000;i++) {
			sum+=i;
		}
		long endTime=System.currentTimeMillis();
		System.out.println("程序运行时间为:"+(endTime-startTime)+"毫秒");
	}

}
