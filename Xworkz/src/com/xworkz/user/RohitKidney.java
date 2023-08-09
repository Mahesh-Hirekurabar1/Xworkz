package com.xworkz.user;

import com.xworkz.mahesh.Kidney;

public class RohitKidney {
	
	private Kidney kidney;

	public RohitKidney(Kidney kidney) {
		this.kidney=kidney;
	}
	public void getclean() {
		if(kidney!=null) {
			System.out.println("Kidney is not clean null");
			this.kidney.clean();
		}
		else {
			System.out.println("Kidney is clean, Can't be null");
		}
	}
	

}
