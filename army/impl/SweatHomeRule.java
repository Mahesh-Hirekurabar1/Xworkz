package com.college.army.impl;

import com.college.army.HomeRules;

public class SweatHomeRule implements HomeRules{
	
		@Override
		public void getHomeBefore() {
			System.out.println("Should be home before 9pm");
		}

		@Override
		public void dontUseBadWords() {
			System.out.println("Should Avoid Using Bad Words");
		}
	
}
