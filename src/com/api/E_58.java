package com.api;

public class E_58 {

	public static void main(String[] args) {
		String s="我爱你中国";
		StringBuffer zfcchc=new StringBuffer(s);
		System.out.println(zfcchc);
		//添加
		zfcchc.append("!");
		System.out.println(zfcchc);
		zfcchc.insert(3,',');
		System.out.println(zfcchc);
		//删除
		zfcchc.delete(2, 4);
		System.out.println(zfcchc);
		//修改
		zfcchc.replace(2, 4, "香港");
		System.out.println(zfcchc);
		//反转
		zfcchc.reverse();
		System.out.println(zfcchc);
	}

}
