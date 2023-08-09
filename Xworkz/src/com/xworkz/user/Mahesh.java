package com.xworkz.user;

import com.xworkz.mahesh.Laptop;

public class Mahesh {
	
	private Laptop laptop;
	
	
		public Mahesh(Laptop laptop) {
			this.laptop=laptop;
		}
		
		public void getdisplay() {
				if (laptop!=null) {
			System.out.println("Laptop is displaying some info");
			this.laptop.display();
	
	}
	else {
		System.out.println("Laptop is not displaying ");
		}
	}
}

