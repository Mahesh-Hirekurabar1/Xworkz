package com.xworkz.mahesh;

public interface KentoPurify extends WaterPurifier {
	
	@Override
	default boolean filter() {
		System.out.println("Invoking filter in purify");
		return false;
	}
	@Override
	default void purify() {
		System.out.println("Invoking filter in purify");
		
	}
	

}
