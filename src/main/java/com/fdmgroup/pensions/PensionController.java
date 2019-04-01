package com.fdmgroup.pensions;

public class PensionController {

	public void handlePensions(Person[] people) {
		
		for(int count = 0; count<people.length; count++)
		{
			Person person = people[count];
			if(PensionLogic.isPensionable(person,"2019")){
				View.printEligible(person);
			}else
			{
				View.printIneligible(person); 
			}
		}
	}
	
}
