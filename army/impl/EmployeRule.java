package com.college.army.impl;

import com.college.army.CompanyRules;

public class EmployeRule implements CompanyRules{

		@Override
		public void getEmployeId() {
			System.out.println("Should Bring Id Card");
		}

		@Override
		public void getFormal() {
			System.out.println("Should Wear formal dress");
		}

}
