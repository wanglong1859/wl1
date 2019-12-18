package com.xiancheng;
//1.定义一个实现了Callable接口的实现类

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyThread6 implements Callable<Object>{

	@Override
	public Object call() throws Exception {
		int i=0;
		while (i++<5) {
			System.out.println(Thread.currentThread().getName()
					+"的call()方法在运行");		
		}
		return i;
	}	
}
public class Thread_test7 {

	public static void main(String[] args) throws InterruptedException, 
												ExecutionException {
		MyThread6 mt6=new MyThread6();
		ExecutorService excutor=Executors.newCachedThreadPool();
		Future<Object> result1=excutor.submit(mt6);
		Future<Object> result2=excutor.submit(mt6);
		excutor.shutdown();
		System.out.println("thread-1返回结果:"+result1.get());
		System.out.println("thread-2返回结果:"+result2.get());
	}

}
