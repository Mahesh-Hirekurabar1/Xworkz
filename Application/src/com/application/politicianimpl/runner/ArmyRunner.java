package com.application.politicianimpl.runner;

import com.application.politician.ArmyRepository;
import com.application.politicianimpl.ArmyRepositoryImpl;

public class ArmyRunner {

	public static void main(String[] args) {
		ArmyRepository army =new ArmyRepositoryImpl();
		army.caption("Hair Cut");
		army.caption("Clean Shave");
		army.caption("Daily workout");
		army.caption("Maintain disciplane");
		army.caption("Kill enemy and save country");

	}

	

	

}
