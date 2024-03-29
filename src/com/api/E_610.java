package com.api;

import java.util.*;

class Student{
	String id;
	String name;
	public Student (String id,String name) {
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return id+":"+name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
public class E_610 {
	public static void main(String[] args) {
		HashSet<Student> hs=new HashSet<Student>();
		Student stu1=new Student("1","Jack");
		Student stu2=new Student("2","Rose");
		Student stu3=new Student("2","Rose");
		hs.add(stu1);
		hs.add(stu2);
		hs.add(stu3);
		System.out.println(hs);
	}
}
