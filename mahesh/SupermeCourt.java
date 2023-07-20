package com.mahesh;

public class SupermeCourt extends Court {

	void importantCase() {
		System.out.println("Invoking importantCase inside superme Court");
	}
	@Override
	void justice() {
		System.out.println("Invoking justice inside SupermeCourt");
	}
	
}
