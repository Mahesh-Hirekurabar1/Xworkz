package com.daimond.app;

public interface FruitShop extends Shop{
	
	void fruit();
	default void fruitName() {
		System.out.println("Invoking default fruitName method in Fruit Shop");
	}
	
	@Override
	default void store() {
		System.out.println("Invoking default Store method in FRuitShop");
	}

	@Override
	default void type() {
		 System.out.println("Invoking defaulyt Store method in FruitShop");
	}

}
