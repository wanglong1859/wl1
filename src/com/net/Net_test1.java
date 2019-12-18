package com.net;

import java.io.IOException;
import java.net.InetAddress;

public class Net_test1 {

	public static void main(String[] args) throws IOException {
		InetAddress localAddress=InetAddress.getLocalHost();
		InetAddress remoteAddress=InetAddress.getByName("www.sanguosha.com");
		System.out.println("本机的IP地址是:"+localAddress.getHostAddress());
		System.out.println("sanguosha的IP地址是:"+remoteAddress.getHostAddress());
		System.out.println("3秒内是否可以访问:"+remoteAddress.isReachable(3000));
		System.out.println("sanguosha的主机名为:"+remoteAddress.getHostName());
	}

}
