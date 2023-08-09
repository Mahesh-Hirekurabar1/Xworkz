package com.xworkz.user.mahesh.runner;

import com.xworkz.mahesh.HumanKidney;
import com.xworkz.mahesh.Kidney;
import com.xworkz.user.RohitKidney;

public class KidneyRunner {
	
	public static void main(String[] args) {
		
		Kidney body =new HumanKidney();
		
		
		RohitKidney rohit =new RohitKidney(body);
		rohit.getclean();
		System.out.println("Invoking clean in KidneyRunner");
		
		
		
	}

}
