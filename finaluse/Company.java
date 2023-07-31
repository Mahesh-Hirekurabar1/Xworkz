package com.mahesh.finaluse;

public class Company {
	  public static void main(String[] args) {
	        Company company = new Company("Amazon", "New York");
	        company.displayInfo();
	    }
	    private String name;
	    private String location;

	    public Company(String name, String location) {
	        this.name = name;
	        this.location = location;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getLocation() {
	        return location;
	    }

	    public void displayInfo() {
	        System.out.println("Company Name: " + name);
	        System.out.println("Location: " + location);
	    }
	}




