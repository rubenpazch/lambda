package FunctionalInterfaces.Entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Congress {
	private List<Person> people;

	public Congress() {
		this.people = new ArrayList<>();
	}
	
	public void add (Person person) {
		people.add(person);
	}

	@Override
	public String toString() {
		return "Congress [people=" + people + "]";
	}
	
	public void sortByFirstName() {
		Collections.sort(people);
	}
	public void sortByLastName() {
		//Collections.sort(people, Person.getLastPersonComparator());
		Collections.sort(people,Comparator.comparing(p->p.getLastName()));
	}

}
