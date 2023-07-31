package com.mahesh.hierarchy;

public class Company {
		
		String founderName = "N. R. Narayana Murthy";
		String companyName="INFOSYS";
		String located="Benglore";
		long totalEmployees;
		
		
		 Company(){
			System.out.println("Constructor1  with no arguements...");
		}
		 Company(String founderName , String companyName){
			System.out.println("Constructor2 with string,string arguements...");
			this.founderName = founderName;
			this. companyName =  companyName;
		}
		 Company(String founderName , String CompanyName , String located){
			this(founderName,CompanyName);
			System.out.println("Constructor3 with string,string,string  arguements...");
			this.located=located;
		}
		 Company(String founderName , String CompanyName , String located , long totalEmployees){
			this(founderName,CompanyName,located);
			System.out.println("Constructor4 with string,string,string,long arguements...");
			this.totalEmployees = totalEmployees;
		}
		
	}

	
