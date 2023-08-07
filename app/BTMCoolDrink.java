package com.daimond.app;

public class BTMCoolDrink implements CokeCoolDrink,PepsiCoolDrink{


	@Override
	public void stamina() {
		System.out.println("Invoking Stamina in BtmCoolDrink");
		
	}

	@Override
	public void energy() {
		System.out.println("Invoking Energy in BtmCoolDrink");
		
	}

	@Override
	public void cool() {
		System.out.println("Invoking Cool in BtmCoolDrink");
	}
	
	
}
	