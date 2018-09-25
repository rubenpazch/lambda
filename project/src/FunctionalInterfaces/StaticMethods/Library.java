package FunctionalInterfaces.StaticMethods;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

import FunctionalInterfaces.Entities.Customer;
import FunctionalInterfaces.Entities.Employee;

public class Library {
	/**
	 * Accepts list of customers and a search string <code>searchStr</code>.
	 * 
	 * Returns the names of those customers whose name begins with
	 * <code>searchStr</code>, in sorted order.
	 */

	public static final BiFunction<List<Customer>, String, List<String>> NAMES_IN_CITY = (list, searchStr) -> list
			.stream()
			.filter(cust -> cust.getCity().toLowerCase()
					.startsWith(searchStr.toLowerCase()))
			.map(cust -> cust.getName())
			.sorted()
			.collect(Collectors.toList());
	
	//compiler error -- need to transform Employee objects to strings
	//System.out.println(list.stream().collect(Collectors.joining(", "));
	public static final Function<List<Employee>,String> LIST_EMPLOYEES =  (list)->list
			.stream()
			.map(Object::toString)
			.collect(Collectors.joining(", "));
	
	
}
