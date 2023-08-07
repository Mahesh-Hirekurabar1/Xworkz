package com.daimond.app;

public interface CokeCoolDrink extends CoolDrink {
	
	public void energy();
	
	@Override
	default void cool() {
		System.out.println("Invoking cool in CokeDrink");
		
	}
	
	
	

}
