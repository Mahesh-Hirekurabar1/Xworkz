package com.college.army.impl;

import com.college.army.MetroRules;

public class MetroGovtRules implements MetroRules {

	@Override
	public Void stop() {
		return null;
	}

	@Override
	public void run() {
		System.out.println("Metro can Run");
	}
	
	

}
