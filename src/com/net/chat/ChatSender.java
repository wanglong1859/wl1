package com.net.chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ChatSender implements Runnable {
	private DatagramSocket ds;
	private int port;
	public ChatSender(DatagramSocket ds, int port) {
		this.ds=ds;
		this.port=port;
	}

	@Override
	public void run() {
		Scanner sc=new Scanner(System.in);
		
			while(true) {
				System.out.print("我说:");
				
			try {
			String data=sc.nextLine();
			byte[] zjsz=data.getBytes("UTF-8");
			System.out.println("这条信息要发给IP:");
			String ip=sc.nextLine();
			DatagramPacket packet=new DatagramPacket(zjsz,zjsz.length,
						InetAddress.getByName(ip),8900);
			ds.send(packet);
			}
		 catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		
		}}
	}
}
