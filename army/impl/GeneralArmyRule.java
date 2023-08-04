package com.college.army.impl;

import com.college.army.ArmyRule;

public class GeneralArmyRule implements ArmyRule {


	@Override
	public void getHairCut() {
		System.out.println("Should Get Short Hair Cut");
	}

	@Override
	public void getUniform() {
		System.out.println("Should Wear Uniform ");
	}

}
