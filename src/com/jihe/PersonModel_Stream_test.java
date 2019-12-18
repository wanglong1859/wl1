package com.jihe;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class PersonModel_Stream_test {

	public static void main(String[] args) {
		List<PersonModel> list=new ArrayList<>();
		PersonModel p1=new PersonModel("Wang Wu",18,"男");
		PersonModel p2=new PersonModel("Zhang San",20,"男");
		PersonModel p3=new PersonModel("Li Si",22,"女");
		PersonModel p4=new PersonModel("Zhao Liu",28,"男");
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);		
	
	for(PersonModel pm:list) {
		System.out.println(pm.getName());
		}
	List<char[]> list2=list.stream().map(a->a.getName()).collect(Collectors.toList());
	System.out.println(list2);
	}
}
