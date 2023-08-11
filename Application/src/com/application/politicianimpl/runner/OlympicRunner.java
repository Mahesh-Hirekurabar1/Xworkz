package com.application.politicianimpl.runner;

import com.application.politician.OlympicRepository;
import com.application.politicianimpl.OlympicRepositoryImpl;

public class OlympicRunner {

	public static void main(String[] args) {
		
		
		OlympicRepository play = new OlympicRepositoryImpl();
		play.games("Running");
		play.games("Kabbadi");
		play.games("Kho-Kho");
		play.games("Foot Ball");
		play.games("Swmming");

	}

}
