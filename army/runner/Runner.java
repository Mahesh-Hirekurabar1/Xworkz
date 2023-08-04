package com.college.army.runner;

import com.college.army.AirpostRules;
import com.college.army.ArmyRule;
import com.college.army.saloonRules;
import com.college.army.impl.CuttingRule;
import com.college.army.impl.DrRules;
import com.college.army.impl.EmployeRule;
import com.college.army.impl.GeneralArmyRule;
import com.college.army.impl.MetroGovtRules;
import com.college.army.impl.SbiRules;
import com.college.army.impl.SweatHomeRule;
import com.college.army.impl.WordenRules;
import com.college.army.impl.localAirPosrtRules;
import com.college.army.BankRules;
import com.college.army.HospitalRules;
import com.college.army.HostelRules;
import com.college.army.MetroRules;

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
			
			System.out.println("Hostel Rules");
			WordenRules rule1= new WordenRules();
			rule1.keepRoomClean();
			rule1.lightOff();
			System.out.println("Name of Bank"+HostelRules.WAKE_UP_AT);
			System.out.println("**********************************************");
			
			System.out.println("Hospital Rules");
			DrRules doctor= new DrRules();
			doctor.givingMedicine();
			doctor.takeCareOfPatient();
			System.out.println("Number of Doctor="+HospitalRules.NUMBER_OF_DOCTORS);
			System.out.println("**********************************************");
			
			System.out.println("Metro Rules");
			MetroGovtRules gov=new MetroGovtRules();
			gov.run();
			gov.stop();
			System.out.println("Metro can fly...?\n"+MetroRules.METRO_CAN_FLY);
			System.out.println("**********************************************");
			
			
		    System.out.println("AirPort Rule");
			localAirPosrtRules airport = new localAirPosrtRules();
			System.out.println("Airport Loction is :"+AirpostRules.FLY);
			airport.passPort();
			airport.visa();
		
			System.out.println("______________________________________________________________");
			
			System.out.println("**Home Rule**");
			SweatHomeRule myHomeRule = new SweatHomeRule();
			System.out.println("Rule Maker is :"+SweatHomeRule.RULE_MAKER);
			myHomeRule.getHomeBefore();
			myHomeRule.dontUseBadWords();
			System.out.println("______________________________________________________________");
			
			
			
			System.out.println("**Company Rule**");
			EmployeRule softwareCompanyRule = new EmployeRule();
			System.out.println("Work Start Time is :"+EmployeRule.NAME);
			softwareCompanyRule.getEmployeId();
			softwareCompanyRule.getFormal();
			System.out.println("______________________________________________________________");

			
			
			
		}
}


