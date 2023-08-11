package com.application.politician;

public interface ApartmentRepository {
	int APARTMENT_NAMES=5;
	String start(String names);
	default void display() {
		
	}

}
