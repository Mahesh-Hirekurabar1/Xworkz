package com.application.politicianimpl.runner;

import com.application.politician.ApartmentRepository;
import com.application.politicianimpl.ApartmentRepositoryImpl;

public class ApartmenntRunner {

	public static void main(String[] args) {
		ApartmentRepository apartment=new ApartmentRepositoryImpl();
		apartment.start("Mahesh Nivas");
		apartment.start("Laxmi Nivas");
		apartment.start("Omkar Nivas");
		apartment.start("Shree Nivas");
		apartment.start("Ganesh Nivas");
			

	}

}
