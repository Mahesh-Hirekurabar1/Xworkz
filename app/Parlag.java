package com.daimond.app;

public interface Parlag extends Biscuit{
	
	void wheatBisuit();
	
	@Override
	default void taste() {
		System.out.println("Invoking taste in Parlag");
		
	}
	@Override
	default void shape() {
		System.out.println("Invoking default shape method in Parlag");
	}
	
	default void color() {
		System.out.println("Invoking default color method in Parlag");
	}

	

}
