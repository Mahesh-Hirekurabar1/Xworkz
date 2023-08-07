package com.daimond.app;

public interface IceCreamShop extends Shop{

		void cream();
		
		default void cupIce() {
			System.out.println("Invoking default CupIce method in IceCreamShop");
		}
		

		
			@Override
			default void store() {
				System.out.println("Invoking defaulyt Store method in IceCreamShop");
			
			}
			@Override
			default void type() {
				System.out.println("Invoking default Type method in IceCreamShop");
			}
}

