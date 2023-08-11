package com.application.politician;

public interface HospitalRepository {
	int TOTAL_HOSPITALS=5;
	
	String names(String nameOfHospital);
	
	
	default void display() {
		
	}

}
	
