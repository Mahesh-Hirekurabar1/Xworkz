package com.xworkz.mahesh;

public class KentoPurify implements WaterPurifier {
	
	@Override
	public boolean filter() {
		System.out.println("Invoking filter in purify");
		return false;
	}
	@Override
	public void purify() {
		System.out.println("Invoking filter in purify");
		
	}
	

}
