package com.wl01;

public class E_07 {

	public static void main(String[] args) {
		int age=19;
		if(age<12){
			System.out.println("此人是小屁孩！");
		}
		else if(age<18) {
			System.out.println("此人未成年！");
	}
		else if(age>18) {
			System.out.println("此人以成年！");
		}
		int month=5;
		switch (month) {
		case 12:
		case 1:
		case 2:	
			System.out.println("现在是冬季！");
			break;
		case 3:
		case 4:
		case 5:	
			System.out.println("现在是春季！");
			break;
		case 6:
		case 7:
		case 8:	
			System.out.println("现在是夏季！");
			break;
		case 9:
		case 10:
		case 11:	
			System.out.println("现在是秋季！");
			break;
		default:
			break;
		}
	}
}