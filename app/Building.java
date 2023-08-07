package com.daimond.app;

public interface Building {
	
	void flors();
	
	default void doors() {
		System.out.println("Invoking Default Doors in Building");
	}

}
