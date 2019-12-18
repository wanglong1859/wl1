package com.jihe;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.util.Properties;

public class Properties_test {

	public static void main(String[] args) throws Exception{
		Properties pps=new Properties();
		pps.load(new FileInputStream("d:/test.properties"));
		pps.forEach((k,v)->System.out.println(k+"="+v));
		
		FileOutputStream out=new FileOutputStream("d:/test.properties");
		pps.setProperty("charset", "UTF-8");
		pps.store(out, "新增charset编码");

	}

}
