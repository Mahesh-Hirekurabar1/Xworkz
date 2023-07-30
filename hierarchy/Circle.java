package com.mahesh.hierarchy;

		class Circle extends Shape {
		    double radius;

		    public Circle(String name, double radius) {
		        super(name);
		        this.radius = radius;
		    }

		    double calculateArea() {
		        return Math.PI * radius * radius;
		    }
		
}
