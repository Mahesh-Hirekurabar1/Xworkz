package com.xworkz.user;

import com.xworkz.mahesh.WaterPurifier;

public class Sachin {

	private WaterPurifier purifier;


	public Sachin(WaterPurifier purifier) {
		this.purifier = purifier;
	}

	public void getPurify() {
		if(purifier!=null) {
			System.out.println("Purify is not null");
			this.purifier.purify();
		}
		else {
			System.err.println("Purify is null, cannot purify");
		}
		
	}
}



