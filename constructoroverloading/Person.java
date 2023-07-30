package com.mahesh.constructoroverloading;

public class Person {
	
	    String name;
	    int age;

	    // Constructor with name and age parameters
	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    // Constructor with only name parameter (age will be set to default value)
	    public Person(String name) {
	        this.name = name;
	        this.age = 0; // Default age
	    }

	    // Constructor with no parameters (name and age will be set to default values)
	    public Person() {
	        this.name = "Unknown";
	        this.age = 0;
	    }

	    // Method to display information about the person
	    void displayInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }
	}



