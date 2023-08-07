package com.daimond.app;

public class SwamiShop implements FruitShop,IceCreamShop{

	@Override
	public void type() {
		System.out.println("Invoking type method in SwamiShop");
	}

	@Override
	public void cream() {
		System.out.println("Invoking cream method in SwamiShop");
		
	}

	@Override
	public void fruit() {
		System.out.println("Invoking fruit method in SwamiShop");
		
	}

	@Override
	public void store() {
		System.out.println("Invoking Strore method in SwamiShop");
	}
	
	@Override
	public void fruitName() {
		System.out.println("Invoking Fruit Name method in SwamiShop");
	}
	
	@Override
	public void cupIce() {
		System.out.println("Invoking cuoIce method in SwamiShop");
	}

	

}
