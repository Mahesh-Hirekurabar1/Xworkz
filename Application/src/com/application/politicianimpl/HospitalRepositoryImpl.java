package com.application.politicianimpl;

import com.application.politician.HospitalRepository;

public class HospitalRepositoryImpl implements HospitalRepository {
	private int index=0;
	private String[] hospital=new String[TOTAL_HOSPITALS];

	@Override
	public String names(String nameOfHospital) {
		
		if(index<TOTAL_HOSPITALS) {
			this.hospital[index]=nameOfHospital;
			System.out.println("Before index valu is "+index);
			
			this.index=index+1;
			System.out.println("At index vale "+this.index + " Name of hospital is "+nameOfHospital);
			System.out.println("Before after valu is "+index);
			
		}else {
			System.err.println("Array length is Completed");
		}
		
		return null;
	}
	@Override
	public void display() {
		for(int start=0; start<hospital.length;start++) {
			System.out.println("Names at index  "+start+" is ="+hospital[start]);
		}
	}

}
