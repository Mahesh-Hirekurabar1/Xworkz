package com.daimond.app;

public interface XworkzBuilding extends Building{
	void color();
	
	default void steps() {
		System.out.println("Invoking Default Steps in XworkzBuilding");	
	}
	@Override
	default void flors() {
		System.out.println("Invoking Default flors in XworkzBuilding");
		
	}
	
	@Override
	default void doors() {
		System.out.println("Invoking Default Doors in XworkzBuilding");
	}

}
