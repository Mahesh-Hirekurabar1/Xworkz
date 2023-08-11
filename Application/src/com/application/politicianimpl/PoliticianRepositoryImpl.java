package com.application.politicianimpl;

import com.application.politician.PoliticianRepository;

public class PoliticianRepositoryImpl implements PoliticianRepository{
	
	private int index = 0;
	private String[] names = new String[TOTAL_NAMES];
	
	@Override
	public void pads(String name) {
			
			if(index < TOTAL_NAMES) {
				this.names[index] =name;
				System.out.println("Before index value="+index);
				System.out.println("At  index " + index + " name is " + name);
				
				
				//System.out.println("Name of Politician is "+name);
				this.index = index + 1;
				System.out.println("After index value="+this.index);
				}
			
		
		else{
			System.err.println("Arry is completed");
			}

		
	}

	@Override
	public void display() {
		System.out.println("Display is running in Politician Repository Impl...");

		for(int start=0; start<TOTAL_NAMES; start++) {
			System.out.println("The names at index " + start + " is " + names[start]);
		}
	}
	
}
