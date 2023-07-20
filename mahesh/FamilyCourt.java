package com.mahesh;

public class FamilyCourt extends CivilCourt {
	
	void divorce() {
		System.out.println("Invoking divorce inside FamilyCourt");
	}
	@Override
	void propertyCase() {
		System.out.println("Invoking propertyCase inside FamilyCourt");
		
	}
	
	@Override
	void theftCase() {
		System.out.println("Invoking theftCase inside FamilyCourt");
	}
	
	
}
