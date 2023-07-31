package com.mahesh.finaluse;

public class Laptop {
	    private final String brand;
	    private final String model;
	    private final int year;

	    public Laptop(String brand, String model, int year) {
	        this.brand = brand;
	        this.model = model;
	        this.year = year;
	    }

	    public String getBrand() {
	        return brand;
	    }

	    public String getModel() {
	        return model;
	    }

	    public int getYear() {
	        return year;
	    }

	    public final void displayInfo() {
	        System.out.println("Brand: " + brand);
	        System.out.println("Model: " + model);
	        System.out.println("Year: " + year);
	    }
	

	
	    public static void main(String[] args) {
	        Laptop laptop = new Laptop("Dell", "12i", 2023);
	        laptop.displayInfo();
	    }  
}	    
	



