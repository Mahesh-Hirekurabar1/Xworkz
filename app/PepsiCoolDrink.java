package com.daimond.app;

public interface PepsiCoolDrink extends CoolDrink{
	
	public void stamina();
	
	@Override
	default void cool() {
		System.out.println("Invoking cool pepsiCoolDRink");
		
	}
}
