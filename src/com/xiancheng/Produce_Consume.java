package com.xiancheng;

import java.util.*;

public class Produce_Consume {

	public static void main(String[] args) {
		List<Object> goods=new ArrayList<>();
		long start=System.currentTimeMillis();
		Thread t1=new Thread(()-> {
			int num=0;
			while (System.currentTimeMillis()-start<30) {
				synchronized (goods) {
					if (goods.size()>0) {
						try {
							goods.wait();
						}catch (InterruptedException e) {
							e.printStackTrace();
						}
					}else {
						goods.add("商品"+(++num));
						System.out.println("生产商品"+num);
					}
				}				
			}
		},"生产者");
		Thread t2=new Thread(()-> {
			int num=0;
			while (System.currentTimeMillis()-start<30) {
				synchronized (goods) {
				if (goods.size()<=0) {
					goods.notify();			
				}else {
					goods.remove("商品"+(++num));
					System.out.println("消费商品"+num);
					}
				}
			}
		},"消费者");
		t1.start();
		t2.start();
	}

}
