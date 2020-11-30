package oop;

class Person {
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name + " is walking.");
	}
	
	void eat(){
		System.out.println(email);
	}
	
	void sleep(){
		System.out.println(name + " is sleeping.");
	}
}

public class demo {
	public static void main (String[] args) {
		// Instantiating the Object
		Person person1 = new Person();
		
		// Define properties
		person1.name = "Joe";
		person1.email = "joe@joe.com";
		person1.phone = "1231412";
		
		// Abstraction
		person1.walk();
		person1.eat();
		person1.sleep();
	}
	
}