package com.mahesh;

public class RunnerForCourt {

	public static void main(String[] args) {
		System.out.println("....................Court.....................");
		Court court = new Court();
		court.justice();
	
		System.out.println("------------------SupermeCourt---------");
        SupermeCourt superme = new SupermeCourt();
        superme.justice();
        superme.importantCase();
	
		System.out.println("______________HighCourt__________");
        HighCourt highCourt = new HighCourt();
        highCourt.importantCase();
        highCourt.criminalCase();
        highCourt.forgeryCase();
        
	     System.out.println("..............CivilCourt..................");
		 CivilCourt civil = new CivilCourt();
		 civil.criminalCase();
		 civil.forgeryCase();
		 civil.propertyCase();
		 civil.theftCase();
		 
		 System.out.println("______________FamilyCourt__________");
		 FamilyCourt familycourt = new FamilyCourt();
		 familycourt.divorce();
		 familycourt.propertyCase();
		 familycourt.theftCase();
		 
	}

}


