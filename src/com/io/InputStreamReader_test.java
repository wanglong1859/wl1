package com.io;

import java.io.*;

public class InputStreamReader_test {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("profile.txt")));
		System.out.println("请输入您的姓名:");
		String line=br.readLine();
		bw.write("您叫:"+line);
		System.out.println("介绍完毕");
		br.close();
		bw.flush();
		bw.close();
	}

}
