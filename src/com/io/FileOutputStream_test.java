package com.io;

import java.io.*;
public class FileOutputStream_test {

	public static void main(String[] args) throws Exception{
		FileOutputStream out=new FileOutputStream("out.txt");
		String str="hello";
		out.write(str.getBytes());
		out.close();
	}
}
