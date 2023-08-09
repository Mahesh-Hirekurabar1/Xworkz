package com.xworkz.user.mahesh.runner;

import com.xworkz.mahesh.CompanyElevator;
import com.xworkz.mahesh.Elevator;
import com.xworkz.user.Murali;

public class ElevatorRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in Elevator Runner\n");

		Elevator elevator = new CompanyElevator();

		Murali murali = new Murali(elevator);
		murali.getCarry();
	}

}
