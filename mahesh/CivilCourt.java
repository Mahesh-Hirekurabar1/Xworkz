package com.mahesh;

public class CivilCourt extends HighCourt {
	
	void propertyCase() {
		System.out.println("Invoking propertyCase inside Civil court");
		
	}
	void theftCase() {
		System.out.println("Invoking theftCase inside Civil court");
	}
	@Override
	void forgeryCase() {
		System.out.println("Invoking forgeryCase in Highcourt");
	}
	@Override
	void criminalCase() {
		System.out.println("Invoking criminalCase in Civil court");
	}
	
	

}
