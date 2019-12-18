package com.net;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		ServerSocket fwqtjz=new ServerSocket(8899);
		while(true) {
			Socket khdtjz=fwqtjz.accept();
			int port=khdtjz.getPort();
			String ip=khdtjz.getInetAddress().getHostAddress();
			System.out.println("和客户端IP地址是"+ip+",端口是"+port+"连接上了");
			InputStream is=khdtjz.getInputStream();
			byte[]zjhc=new byte[1024];
			FileOutputStream fout=new FileOutputStream("d:\\upload\\"+ip+".jpg");
			int b=is.read(zjhc);
			while(b!=-1) {
				fout.write(zjhc,0,b);
				b=is.read(zjhc);
			}
			String xinxi="文件上传成功";
			zjhc=new byte[1024];
			OutputStream os=khdtjz.getOutputStream();
			os.write(xinxi.getBytes("UTF-8"));
			os.close();
			//khdtjz.close();
		}
	}
}
