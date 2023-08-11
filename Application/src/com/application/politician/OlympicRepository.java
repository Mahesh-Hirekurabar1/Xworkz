package com.application.politician;

public interface OlympicRepository {
	int TOTAL_OLYMPIC=5;
	
	String games(String nameOfGames);
	
	default void display() {
		
	}

}
