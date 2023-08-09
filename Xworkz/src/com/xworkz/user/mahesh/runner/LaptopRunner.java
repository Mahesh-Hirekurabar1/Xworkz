package com.xworkz.user.mahesh.runner;

import com.xworkz.mahesh.AsusLaptop;
import com.xworkz.mahesh.Laptop;
import com.xworkz.user.Mahesh;

public class LaptopRunner {
	
	public static void main(String[] args) {
		
		Laptop laptop = new AsusLaptop();
		
		Mahesh mahesh = new Mahesh(laptop);
		mahesh.getdisplay();
		
	}

}
