package com.wl01;	//package:包
/*
 * 紫色的代码是关键字
 * 褐色的代码是参数或者局部变量
 * 蓝色的代码是成员变量，它的地位比局部变量高，地位同成员方法一样
 * 黑色的代码是标示符:包名(com.wl01)、类名(Zhengshuleixing)
 */
public class Zhengshuleixing {	//class:类	 public:修饰符 表示公有的
	byte b2=1;
	public static void main(String[] args) {
		//static:修饰符 表示静态的  	void:空的 表示该方法没有返回值
		@SuppressWarnings("unused")
		byte b =1;	//00000001
		@SuppressWarnings("unused")
		short s =1;	//00000000 00000001
		@SuppressWarnings("unused")
		int i =1; 	//00000000 00000000 00000000 00000001
		@SuppressWarnings("unused")
		long l =1;	//00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000001
		@SuppressWarnings("unused")
		float f=1.0f;//1.0是双精度浮点数长度是64位，而float是32位
					 //1.0f是单精度浮点书长度是32位
		@SuppressWarnings("unused")
		double d=1.0;
		
		char c='a';
		char ch=97;
		short ca=97;
		@SuppressWarnings("unused")
		boolean flagl=true;
		@SuppressWarnings("unused")
		boolean flagl2=false;
		
		System.out.println(c);
		System.out.println(ch);
		System.out.println((char)ca);
		System.out.println("字节型整数数据的长度为"+Byte.SIZE);
		System.out.println("短整型整数数据的长度为"+Short.SIZE);
		System.out.println("整型整数数据的长度为"+Integer.SIZE);
		System.out.println("长整型整数数据的长度为"+Long.SIZE);
		
		System.out.println("单精度浮点型数据的长度位"+Float.SIZE);
		System.out.println("双精度浮点型数据的长度位"+Double.SIZE);
		
		System.out.println("字符型数据的长度位"+Character.SIZE);	
		
		System.out.println("字节型整数数据的范围为"+Byte.MIN_VALUE+"-"+Byte.MAX_VALUE);
		System.out.println("短整型整数数据的范围为"+Short.MIN_VALUE+"-"+Short.MAX_VALUE);
		System.out.println("整型整数数据的范围为"+Integer.MIN_VALUE+"-"+Integer.MAX_VALUE);
		System.out.println("长整型整数数据的范围为"+Long.MIN_VALUE+"-"+Long.MAX_VALUE);
		
		System.out.println("单精度浮点型数据的范围"+Float.MIN_VALUE+"-"+Float.MAX_VALUE);
		System.out.println("双精度浮点型数据的范围"+Double.MIN_VALUE+"-"+Double.MAX_VALUE);
		System.out.println("字符型浮点型数据的范围"+(int)Character.MIN_VALUE+"-"+(int)Character.MAX_VALUE);
		System.out.println("字符型浮点型数据的范围"+Boolean.TRUE+"-"+Boolean.FALSE);		
	}

}
