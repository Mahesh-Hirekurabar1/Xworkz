package com.college.army.runner;

import com.college.army.ArmyRule;
import com.college.army.CuttingRule;
import com.college.army.GeneralArmyRule;
import com.college.army.saloonRules;
import com.college.army.BankRules;



public class Runner {

	public static void main(String[] args) {
		

			System.out.println("**ArmyRule**");
			GeneralArmyRule generalArmyRule = new GeneralArmyRule();
			generalArmyRule.getHairCut();
			generalArmyRule.getUniform();
			System.out.println("Wake Up At :"+ArmyRule.WAKE_UP_AT);
			
			System.out.println("*****************************************");
			
			System.out.println("*saloonRules*");
			CuttingRule rule= new CuttingRule();
			rule.getstyleHairCut();
			rule.getuseNewBlade();
			System.out.println("Name of Style:"+saloonRules.nameOfTheCutting);
			System.out.println("**********************************************");
			
			System.out.println("bank Rules");
			SbiRules bank = new SbiRules();
			bank.getPassbook();
			bank.getAtm();
			System.out.println("NAme of Bank"+BankRules.BANK_NAME);
			System.out.println("**********************************************");
			
		}
}


