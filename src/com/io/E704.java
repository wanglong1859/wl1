package com.io;
import java.io.*;
public class E704 {

	public static void main(String[] args) throws Exception{
		FileInputStream fin=new FileInputStream("d://src.jpg");
		FileOutputStream fout=new FileOutputStream("src.jpg");
		
		long beginTime=System.currentTimeMillis();
		byte[]zjhc=new byte[1024];
		int len=fin.read(zjhc);
		while (len!=-1 ) {
			fout.write(zjhc,0,len);	
			len=fin.read(zjhc);
		}
		long endTime=System.currentTimeMillis();
		System.out.println("花费时间为:"+(endTime-beginTime)+"毫秒");
		fin.close();
		fout.close();
	}

}
