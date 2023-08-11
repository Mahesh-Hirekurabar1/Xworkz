package com.application.politicianimpl;

import com.application.politician.OlympicRepository;

public class OlympicRepositoryImpl implements OlympicRepository {
		private int index=0;
		private String[] olympic = new String[TOTAL_OLYMPIC];
	@Override
	public String games(String nameOfGames) {
		if(index<TOTAL_OLYMPIC) {
			this.olympic[index]=nameOfGames;
			System.out.println("Before index value is "+index);
			this.index=index+1;
			System.out.println("index value is "+index +" Olympic name is "+nameOfGames);
			System.out.println(" After index value is "+this.index);
		}
		else {
			System.err.println("Array is full");
		}
		
		return null;
	}
	@Override
	public void display() {
		for(int start=0; start<olympic.length;start++);
		System.out.println("Names at index  "+index+" is ="+olympic[index]);
	}

}
