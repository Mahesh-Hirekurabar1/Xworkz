package com.daimond.app.runner;

import com.daimond.app.FruitShop;
import com.daimond.app.IceCreamShop;
import com.daimond.app.Shop;
import com.daimond.app.SwamiShop;

public interface ShopRunner {
	
	public static void main(String[] args) {
		
		SwamiShop swami = new SwamiShop();
		swami.cream();
		swami.cupIce();
		swami.fruit();
		swami.fruitName();
		swami.store();
		swami.type();
		
		
		IceCreamShop ice=new SwamiShop();
		ice.cream();
		ice.cupIce();
		ice.store();
		ice.type();
		
		FruitShop apple = new SwamiShop();
		apple.fruit();
		apple.fruitName();
		apple.store();
		apple.type();
		
		
		Shop shop = new SwamiShop();
		shop.store();
		shop.type();
		
		
	}
}
