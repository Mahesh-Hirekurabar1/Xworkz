package com.daimond.app.runner;

import com.daimond.app.Building;
import com.daimond.app.MaheshHome;
import com.daimond.app.OfficeBuilding;
import com.daimond.app.XworkzBuilding;

public interface BuildingRunner {
	
	public static void main(String[] args) {
		
		
		MaheshHome mahesh = new MaheshHome();
		mahesh.color();
		mahesh.doors();
		mahesh.flors();
		mahesh.steps();
		mahesh.workPlace();
		mahesh.Windows();
		
		
		OfficeBuilding office = new MaheshHome();
		office.doors();
		office.flors();
		office.workPlace();
		office.Windows();
		
		
		XworkzBuilding xworkz = new MaheshHome();
		xworkz.color();
		xworkz.doors();
		xworkz.flors();
		xworkz.steps();
		
		
		
		Building building = new MaheshHome();
		building.doors();
		building.flors();
		
	}

}
