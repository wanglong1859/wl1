package com.api;

public class E_55 {

	public static void main(String[] args) {
		String s1="java";
		System.out.println("s1转成大写后是"+s1.toUpperCase());
		System.out.println("整数12转成字符串以后是"+String.valueOf(12));
		
		String s2="   http:// localhost : 8080    ";
		System.out.println("字符串不去任何空格的样式是"+s2);
		System.out.println("字符串去掉两端的空格以后是"+s2.trim());
		System.out.println("字符串去掉所有的空格以后是"+s2.replace(" ",""));
		System.out.println("字符串去掉所有的空格以后是"+s2.replaceAll("\\s+",""));
	}

}
