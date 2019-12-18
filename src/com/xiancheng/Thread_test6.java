package com.xiancheng;
class DeadLockThread implements Runnable{
	static Object chopsticks=new Object();
	static Object knifAndFork=new Object();
	private boolean flag;
	DeadLockThread(boolean flag) {
		this.flag=flag;
	}
	@Override
	public void run() {
		if (flag) {
			while (true) {
				synchronized (chopsticks) {
					System.out.println(Thread.currentThread().getName()
							+"---if---chopsticks");
					synchronized (knifAndFork) {
						System.out.println(Thread.currentThread().getName()
								+"---if---knifAndFork");
					}
				}				
			}
		}else {
			while (true) {
				synchronized (knifAndFork) {
					System.out.println(Thread.currentThread().getName()
							+"---else---knifAndFork");
				synchronized (chopsticks) {
					System.out.println(Thread.currentThread().getName()
							+"---else---chopsticks");					
					}
				}
			}
		}		
	}	
}
public class Thread_test6 {
	public static void main(String[] args) {
		DeadLockThread thread1=new DeadLockThread(true);
		DeadLockThread thread2=new DeadLockThread(false);
		new Thread(thread1,"Chinese").start();
		new Thread(thread2,"American").start();
	}
}
