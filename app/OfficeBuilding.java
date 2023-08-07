package com.daimond.app;

public interface OfficeBuilding extends Building{
	
	void Windows();
	
	default void workPlace() {
		System.out.println("Invoking Default WorkPlace in Office Building");
		
	}
	@Override
	default void flors() {
		System.out.println("Invoking Default Flors in Office Building");
		
	}
	
	@Override
	default void doors() {
		System.out.println("Invoking Default Doors in Office Building");
	}

}
