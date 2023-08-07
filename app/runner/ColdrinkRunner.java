package com.daimond.app.runner;

import com.daimond.app.BTMCoolDrink;
import com.daimond.app.CokeCoolDrink;
import com.daimond.app.CoolDrink;
import com.daimond.app.PepsiCoolDrink;

public class ColdrinkRunner {
	public static void main(String[] args) {
		
		
		BTMCoolDrink bdm =new BTMCoolDrink();
		bdm.cool();
		bdm.energy();
		bdm.stamina();
		
		
		PepsiCoolDrink pepsi = new BTMCoolDrink();
		pepsi.cool();
		pepsi.stamina();
		
		
		CokeCoolDrink cd=new BTMCoolDrink();
		cd.cool();
		cd.energy();
				
		CoolDrink drink =new	BTMCoolDrink();
		drink.cool();
		
		
		
	}
	

}
