package com.xworkz.user;

import com.xworkz.mahesh.Elevator;

public class Murali {

		private Elevator elevator;

		public Murali(Elevator elevator) {
			this.elevator = elevator;
		}

		public void getCarry() {
			if(elevator!=null) {
				System.out.println("Elevator is not null");
				this.elevator.carryLuggage();
			}
			else {
				System.err.println("Elevator is null, cannot carry");
			}
		}
	}
