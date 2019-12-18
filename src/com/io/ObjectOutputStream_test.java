package com.io;

import java.io.*;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStream_test {

	public static void main(String[] args) throws Exception{
		FileOutputStream fout=new FileOutputStream("obj.txt");
		@SuppressWarnings("resource")
		ObjectOutputStream out=new ObjectOutputStream(fout);
		Person p1=new Person("mike",40);
		out.writeObject(p1);
		
		@SuppressWarnings("resource")
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("obj.txt"));
		Person person=(Person)in.readObject();
		System.out.println("name="+person.getName());
		System.out.println("age="+person.getAge());
	}

}
