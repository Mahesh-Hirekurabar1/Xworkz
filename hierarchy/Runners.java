package com.mahesh.hierarchy;

public class Runners {

	public static void main(String[] args) {
	
			System.out.println("Running main");
			
				Company company1 = new  Company();
				System.out.println("Infosys Founder Name :" +company1.founderName);
				System.out.println("Infosys founder's Wife Name :" +company1.companyName);
				System.out.println("Infosys founded in year  :" +company1.located);
				System.out.println("Total Employees in Infosys :" +company1.totalEmployees);
				

				 Company company2 = new Company("Mahesh" , "Wipro");
			    System.out.println("Infosys Founder Name :" +company2.founderName);
				System.out.println("Infosys founder's Wife Name :" +company2.companyName);
				System.out.println("Infosys founded in year  :" +company2.located);
				System.out.println("Total Employees in Infosys :" +company2.totalEmployees);
				

			
	}

}
