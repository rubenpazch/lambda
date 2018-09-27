package FunctionalInterfaces.Entities;

import java.util.Comparator;
import java.util.List;

public class Person implements Comparable<Person>{
	private String title;
	private String lastName;
	private String firstName;
	private String party;
	
	
	
	public Person(String title,  String firstName,String lastName, String party) {
		super();
		this.title = title;
		this.lastName = lastName;
		this.firstName = firstName;
		this.party = party;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the party
	 */
	public String getParty() {
		return party;
	}
	/**
	 * @param party the party to set
	 */
	public void setParty(String party) {
		this.party = party;
	}
	public static Comparator<Person> getLastPersonComparator() {
		// TODO Auto-generated method stub
		return lastPersonComparator;
	}
	private static final Comparator<Person> lastPersonComparator=new Comparator<Person>(){
		@Override
		public int compare(Person o1, Person o2)
		{
			return o1.getLastName().compareTo(o2.getLastName());
		}
	};
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [title=" + title + ", lastName=" + lastName + ", firstName=" + firstName + ", party=" + party
				+ "] \n";
	}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.firstName.compareTo(o.getFirstName());
	}
	
	
	
}
