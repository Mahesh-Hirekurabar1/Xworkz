package com.application.politician;

public interface PoliticianRepository {
	
	int TOTAL_NAMES=5;
	
	
	void pads(String name);
	
	default void display() {
		
	}

	

}
