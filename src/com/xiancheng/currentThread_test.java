package com.xiancheng;

class TicketWindow extends Thread{
	private int tickets=10;
	Object Lock=new Object();	
	public void run() {
		while(true) {
			synchronized (Lock) {						
			if (tickets>0) {
				try {
					Thread.sleep(100);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}				
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
public class currentThread_test {
	public static void main(String[] args) {
		TicketWindow tw=new TicketWindow();
		new Thread(tw,"窗口1").start();
		new Thread(tw,"窗口2").start();
		new Thread(tw,"窗口3").start();
		new Thread(tw,"窗口4").start();
	}
}
