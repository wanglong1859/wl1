package com.net;

import java.net.*;

public class UDPSender_test {
	public static void main(String[] args) throws Exception {
		DatagramSocket client=new DatagramSocket();
		String str="";
		byte[] zjsz=str.getBytes("UTF-8");
		DatagramPacket packet=new DatagramPacket(zjsz,zjsz.length,
					InetAddress.getByName("10.2.103.233"),8900);
		System.out.println("开始发送信息...");
		client.send(packet);
		client.close();
	}
}