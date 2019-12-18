package com.api;

public class E_56 {

	public static void main(String[] args) {
		String string="2019-10-12";
		System.out.println("从第6个字符截取到末尾的结果:"+string.substring(5));
		System.out.println("从第6个字符截取到第7个字符的结果:"+string.substring(5,7));
		
		System.out.println("今年是:"+string.substring(0,4));
		System.out.println("本月是:"+string.substring(5,7));
		System.out.println("今日是:"+string.substring(8));
		
		String[] zfcsz=string.split("-");
		System.out.println("今天是:"+zfcsz[0]+"年"+zfcsz[1]+"月"+zfcsz[2]+"日");
		
		System.out.print("分割后的字符串数组中的元素依次为:");
		String[] strArray=string.split("-");
		for (int i = 0; i < strArray.length; i++) {
			if (i !=strArray.length-1) {
				System.out.print(strArray[i]+"、");
			}else {
				System.out.println(strArray[i]);
			}		
		}
	}
}
