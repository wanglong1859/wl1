package com.xiancheng;

import java.util.concurrent.locks.*;
import java.util.concurrent.locks.ReentrantLock;

class LockThread implements Runnable{
	private int tickets=10;
	private final Lock lock=new ReentrantLock();
	@Override
	public void run() {
		while (true) {
			lock.lock();
			if (tickets>0) {
				try {
					Thread.sleep(100);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}finally {
					lock.unlock();
				}
			}
			if (tickets>0) {
				System.out.println(Thread.currentThread().getName()+
						"正在发售第"+tickets--+"张票");
			}else {
				break;
			}
		}	
	}
}
public class Thread_test5 {

	public static void main(String[] args) {
		LockThread tw=new LockThread();
		new Thread(tw,"窗口1").start();
		new Thread(tw,"窗口2").start();
		new Thread(tw,"窗口3").start();
		new Thread(tw,"窗口4").start();

	}

}
