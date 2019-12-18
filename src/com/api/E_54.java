package com.api;

public class E_54 {

	public static void main(String[] args) {
		String s1="abc158a我bc3爱415c我b1的2aa祖21n国3b.jpg";
		System.out.println("这个字符里的数字是:");
		char[] zfsz=s1.toCharArray();
		for(char zf : zfsz) {
			if(zf>='0'&&zf<='9') {
				System.out.print(zf+" ");
			}
		}
		System.out.println("\n这个字符里的汉子是:");

		for(char zf : zfsz) {
			if(zf>='\u4E00'&&zf<='\u9FA5') {
				System.out.print(zf+" ");
			}
		}
	}
}
