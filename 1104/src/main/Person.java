package main;

//
public class Person {
	private String name;
	private int age;

	public Person() {
		System.out.println("Person() call");
		name = "noname";
		age = 1;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;

		
	}

	public void sleep() {
		System.out.println("����� 8�ð� �ܴ�.");

	}

	public void showPersonInfo() {
		System.out.println();
	}
}
