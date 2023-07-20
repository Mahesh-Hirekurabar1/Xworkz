package com.mahesh;

public class HighCourt extends SupermeCourt {
	
	void criminalCase() {
		System.out.println("Invoking criminalCase in Highcourt");
	}
	void forgeryCase() {
		System.out.println("Invoking forgeryCase in Highcourt");
	}
	@Override
	void importantCase() {
		System.out.println("Invoking importantCase inside High Court");
	}
	
	
}


