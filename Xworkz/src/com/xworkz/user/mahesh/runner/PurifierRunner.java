package com.xworkz.user.mahesh.runner;

import com.xworkz.mahesh.WaterPurifier;
import com.xworkz.user.Sachin;
import com.xworkz.mahesh.KentoPurify;

public class PurifierRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Water Purifier Runner\n");

		WaterPurifier purifier = new KentoPurify();

		Sachin sachin = new Sachin(purifier);
		sachin.getPurify();
		System.out.println("Invoking purify in Purifier Runner");

	}

}

