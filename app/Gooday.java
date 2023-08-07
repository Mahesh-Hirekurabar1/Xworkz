package com.daimond.app;

public interface Gooday extends Biscuit{
	
	void crunchy();
	
	@Override
	default void taste() {
		System.out.println("Invoking Taste in Gooday");
		
	}
	@Override
	default void shape() {
		System.out.println("Invoking default shape method in Gooday");
	}
	
	default void circle() {
		System.out.println("Invoking default circle method in Gooday");
	}

}
