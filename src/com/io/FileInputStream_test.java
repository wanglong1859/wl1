		package com.io;

import java.io.*;

public class FileInputStream_test {

	public static void main(String[] args) throws Exception{
		FileInputStream in=new FileInputStream("test.txt");
		int b=in.read();
		while(b!=-1){
			System.out.print((char)b);
			b=in.read();
		}
		in.close();
	}

}
