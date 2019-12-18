package com.xiancheng;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;


class MyThread_1 implements Callable<Object>{

	@Override
	public Object call() throws Exception {
		int sum=0;
		for(int i=1 ;i<11;i++) {
			sum+=i;
		}
		return sum;
	}	
}
class MyThread_2 implements Callable<Object>{

	@Override
	public Object call() throws Exception {
		int sum=0;
		for(int i=11 ;i<21;i++) {
			sum+=i;
		}
		return sum;
	}	
}
class MyThread_3 implements Callable<Object>{

	@Override
	public Object call() throws Exception {
		int sum=0;
		for(int i=21 ;i<31;i++) {
			sum+=i;
		}
		return sum;
	}	
}
class MyThread_4 implements Callable<Object>{
	
	@Override
	public Object call() throws Exception {
		int sum=0;
		for(int i=31 ;i<41;i++) {
			sum+=i;
		}
		return sum;
	}	
}
class MyThread_5 implements Callable<Object>{
	
	@Override
	public Object call() throws Exception {
		int sum=0;
		for(int i=41 ;i<51;i++) {
			sum+=i;
		}
		return sum;
	}	
}
class MyThread_6 implements Callable<Object>{
	
	@Override
	public Object call() throws Exception {
		int sum=0;
		for(int i=51 ;i<61;i++) {
			sum+=i;
		}
		return sum;
	}	
}
class MyThread_7 implements Callable<Object>{
	
	@Override
	public Object call() throws Exception {
		int sum=0;
		for(int i=61 ;i<71;i++) {
			sum+=i;
		}
		return sum;
	}	
}
class MyThread_8 implements Callable<Object>{
	
	@Override
	public Object call() throws Exception {
		int sum=0;
		for(int i=71 ;i<81;i++) {
			sum+=i;
		}
		return sum;
	}	
}
class MyThread_9 implements Callable<Object>{
	
	@Override
	public Object call() throws Exception {
		int sum=0;
		for(int i=81 ;i<91;i++) {
			sum+=i;
		}
		return sum;
	}	
}
class MyThread_10 implements Callable<Object>{
	
	@Override
	public Object call() throws Exception {
		int sum=0;
		for(int i=91 ;i<101;i++) {
			sum+=i;
		}
		return sum;
	}	
}
public class P387 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		MyThread_1 mt1=new MyThread_1();
		FutureTask<Object> ft1=new FutureTask<>(mt1);
		Thread t1=new Thread(ft1,"线程1");
		t1.start();
		//System.out.println("线程1求和的结果是:"+ft1.get());
		
		MyThread_2 mt2=new MyThread_2();
		FutureTask<Object> ft2=new FutureTask<>(mt2);
		Thread t2=new Thread(ft2,"线程2");
		t2.start();
		MyThread_3 mt3=new MyThread_3();
		FutureTask<Object> ft3=new FutureTask<>(mt3);
		Thread t3=new Thread(ft3,"线程3");
		t3.start();
		MyThread_4 mt4=new MyThread_4();
		FutureTask<Object> ft4=new FutureTask<>(mt4);
		Thread t4=new Thread(ft4,"线程4");
		t4.start();
		MyThread_5 mt5=new MyThread_5();
		FutureTask<Object> ft5=new FutureTask<>(mt5);
		Thread t5=new Thread(ft5,"线程5");
		t5.start();
		MyThread_6 mt6=new MyThread_6();
		FutureTask<Object> ft6=new FutureTask<>(mt6);
		Thread t6=new Thread(ft6,"线程6");
		t6.start();
		MyThread_7 mt7=new MyThread_7();
		FutureTask<Object> ft7=new FutureTask<>(mt7);
		Thread t7=new Thread(ft7,"线程7");
		t7.start();
		MyThread_8 mt8=new MyThread_8();
		FutureTask<Object> ft8=new FutureTask<>(mt8);
		Thread t8=new Thread(ft8,"线程8");
		t8.start();
		MyThread_9 mt9=new MyThread_9();
		FutureTask<Object> ft9=new FutureTask<>(mt9);
		Thread t9=new Thread(ft9,"线程9");
		t9.start();
		MyThread_10 mt10=new MyThread_10();
		FutureTask<Object> ft10=new FutureTask<>(mt10);
		Thread t10=new Thread(ft10,"线程10");
		t10.start();
		//System.out.println("线程2求和的结果是:"+ft2.get());
		int total=(int)ft1.get()+(int)ft2.get()+(int)ft3.get()+(int)ft4.get()
					+(int)ft5.get()+(int)ft6.get()+(int)ft7.get()+(int)ft8.get()
					+(int)ft9.get()+(int)ft10.get();
		System.out.println("线程1到线程10的求和结果是"+total);
	}

}
