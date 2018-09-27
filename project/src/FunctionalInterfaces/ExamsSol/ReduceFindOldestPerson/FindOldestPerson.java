package FunctionalInterfaces.ExamsSol.ReduceFindOldestPerson;

import java.util.List;

//DO NOT MODIFY METHOD SIGNATURE OR STATIC QUALIFIER
public class FindOldestPerson {
	public static Person findOldestPerson(List<Person> persons) {
		//implement
		return persons.stream().reduce((x,y)->{
			Person max;
			if(x.getAge()>y.getAge())
				max=x;
			
			else
				max=y;
				
			return max;
		}).get();
				                        
	}
	
	
}
