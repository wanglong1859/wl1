package com.inner;



@FunctionalInterface
interface PersonBuilder{
	Person buildPerson(String name);
}
class Person{
	private String name;
	public Person (String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}
public class E_26 {
	public static void printName(String name,PersonBuilder builder) {
		System.out.println(builder.buildPerson(name).getName());
	}
	public static void main(String[] args) {
		printName("赵丽颖",name->new Person(name));
		printName("赵丽颖",Person::new);
	}

}
