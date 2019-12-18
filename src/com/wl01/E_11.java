package com.wl01;

class Student{
	static String schoolName;
}
public class E_11 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Student stu1=new Student();
		Student stu2=new Student();
		Student.schoolName="江汉艺术职业学院";

		System.out.println("我是"+stu1.schoolName+"的学生");
		System.out.println("我是"+stu2.schoolName+"的学生");
	}

}
