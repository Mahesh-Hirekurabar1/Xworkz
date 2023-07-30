package com.mahesh.constructoroverloading;

public class Runner {

	    public static void main(String[] args) {
	        // Creating objects using different constructors
	        Person person1 = new Person("John Doe", 30);
	        Person person2 = new Person("Jane Smith");
	        Person person3 = new Person();

	        // Displaying information for each person
	        System.out.println("Person 1:");
	        person1.displayInfo();

	        System.out.println("\nPerson 2:");
	        person2.displayInfo();

	        System.out.println("\nPerson 3:");
	        person3.displayInfo();
	    }
}



