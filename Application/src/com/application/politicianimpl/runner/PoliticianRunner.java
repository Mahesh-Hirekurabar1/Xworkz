package com.application.politicianimpl.runner;

import com.application.politicianimpl.PoliticianRepositoryImpl;

public class PoliticianRunner {

	public static void main(String[] args) {
			
		
		PoliticianRepositoryImpl politician = new PoliticianRepositoryImpl();
		politician.pads("Siddu");
		politician.pads("Mahesh");
		politician.pads("BRP");
		politician.pads("Omkar");
		politician.pads("BSY");
		
			
		
	}
}