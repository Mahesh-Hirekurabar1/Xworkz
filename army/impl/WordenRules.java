package com.college.army.impl;

import com.college.army.HostelRules;

public class WordenRules implements HostelRules {

	@Override
	public void lightOff() {
		System.out.println("Turn OF Lights");
		
	}

	@Override
	public void keepRoomClean() {
		System.out.println("Keep Room clean");
		
	}
	
	

}
