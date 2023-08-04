package com.college.army.impl;

import com.college.army.BankRules;

public class SbiRules implements BankRules{

	@Override
	public void getPassbook() {
		
			System.out.println("Should brink Pass Book to Bank");
		
		
	}
	@Override
	public void getAtm() {
		System.out.println("Should wait in queue to get your Turn");
		
	}

}


