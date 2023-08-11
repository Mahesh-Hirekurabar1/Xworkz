package com.application.politicianimpl.runner;

import com.application.politician.HospitalRepository;
import com.application.politicianimpl.HospitalRepositoryImpl;

public class HospitalRunner {
	public static void main(String[] args) {
		
		
		HospitalRepository hospital=new HospitalRepositoryImpl();
		hospital.names("KLE Hospital");
		hospital.names("Jayadev Hospital");
		hospital.names("BLDE Hospital");
		hospital.names("Kenya Hospital");
		hospital.names("Sanjiv Hospital");
		hospital.display();
	}

}
