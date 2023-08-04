package com.college.army.impl;

import com.college.army.saloonRules;

public class CuttingRule implements saloonRules {
	@Override
	public void getstyleHairCut(){
		System.out.println("We get Stylish HairCut");
		
	}
	@Override
	public void getuseNewBlade() {
		System.out.println("use new blade for each");
	}

}