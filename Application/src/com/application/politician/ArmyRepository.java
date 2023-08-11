package com.application.politician;

public interface ArmyRepository {
	
	int NUMBER_OF_RULES=5;
	


	void caption(String nameOfRules);
	
	default void display() {
		
	}
	

}
