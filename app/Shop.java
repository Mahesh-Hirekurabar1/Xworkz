package com.daimond.app;

public interface Shop {
	
	void store();
	
	default  void type() {
		System.out.println("Invoking defaulyt Type method in Shop");
	}

}
