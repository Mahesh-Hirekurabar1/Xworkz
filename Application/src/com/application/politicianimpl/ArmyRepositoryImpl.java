package com.application.politicianimpl;

import com.application.politician.ArmyRepository;

public class ArmyRepositoryImpl implements ArmyRepository {
	private String[] rule =new String[NUMBER_OF_RULES];
	private int index =0;

	@Override 
	public void caption(String nameOfRules) {
		if(index<NUMBER_OF_RULES) {
			this.rule[index]=nameOfRules;
			System.out.println("Before index value="+index);
			System.out.println("Army rules are "+nameOfRules);
			this.index=index+1;
			System.out.println("After index value="+this.index);
			
		}
		
		
	}
	public void display()
	{
		for(int start=0;start<rule.length;start++)
		{
			System.out.println("Names at index  "+start+" is ="+rule[start]);
		}
	}

}
