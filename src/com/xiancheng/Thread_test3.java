package com.xiancheng;
class EmergencyThread implements Runnable{
	@Override
	public void run() {
		for (int i = 1; i < 6; i++) {
			System.out.println(Thread.currentThread().getName()+"输入:"+i);
		}
	}
}
public class Thread_test3 {
	public static void main(String[] args) throws InterruptedException {
		Thread thread1=new Thread(new EmergencyThread(),"thread1");
		thread1.start();
		for (int i = 0; i < 6; i++) {
			System.out.println(Thread.currentThread().getName()+"输入:"+i);
			if (i == 2) {
				thread1.join();
			}
		}
	}
}
