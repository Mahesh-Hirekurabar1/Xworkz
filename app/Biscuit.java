package com.daimond.app;

public interface Biscuit {
	void taste();
	
	 default void shape() {
		System.out.println("Invoking default method in Biscuit");
	}

}
