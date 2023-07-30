package com.mahesh.hierarchy;

public class Runner {

	   	public static void main(String[] args) {
	        // Creating a Circle object
	        Circle circle = new Circle("Circle", 5.0);

	        // Creating a Rectangle object
	        Rectangle rectangle = new Rectangle("Rectangle", 4.0, 3.0);

	        System.out.println("Area of the circle: " + circle.calculateArea());

	        System.out.println("Area of the rectangle: " + rectangle.calculateArea());
	    }
}


