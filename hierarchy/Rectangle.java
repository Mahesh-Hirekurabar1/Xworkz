package com.mahesh.hierarchy;

public class Rectangle {

	
	    double length;
	    double width;

	    public Rectangle(String name, double length, double width) {
	        
	        this.length = length;
	        this.width = width;
	    }

	    double calculateArea() {
	        return length * width;
	    }
	

}
