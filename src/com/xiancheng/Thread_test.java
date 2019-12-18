package com.xiancheng;
class Mythread1 extends Thread{
	public Mythread1(String name) {
		super(name);
	}
	public void run() {
		int i=0;
		while (i++<5) {
			System.out.println(Thread.currentThread().getName()+"的run()方法在运行");
		}
	}
}
public class Thread_test {

	public static void main(String[] args) {
		Mythread1 thread1=new Mythread1("thread1");
		thread1.start();
		Mythread1 thread2=new Mythread1("thread2");
		thread2.start();
	}

}
