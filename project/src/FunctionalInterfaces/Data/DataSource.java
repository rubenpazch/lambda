package FunctionalInterfaces.Data;

import java.util.Arrays;
import java.util.List;

import FunctionalInterfaces.Entities.Customer;
import FunctionalInterfaces.Entities.Employee;


public class DataSource {
	public static List<Customer> listCustomer(){
		Customer cust1 = new Customer("Bob", "11 Adams", "Fairfield", "52556");
		Customer cust2 = new Customer("Laurence Lebihans",	"12, rue des Bouchers",	"Marseille","13008");
		Customer cust3 = new Customer("Andy", "1000 Channing Ave", "Palo Alto", "94301");
		Customer cust4 = new Customer("Zeke", "212 Wilkshire Blvd", "Chicago", "57532");
		Customer cust5 = new Customer("Blauer Delikatessen", "Forsterstr. 57","Mannheim",	"68306");
		List<Customer> list = Arrays.asList(cust1, cust2, cust3, cust4, cust5);		
		return list;
	}
	
	public static List<Employee> listEmployees(){
		List<Employee> list = Arrays.asList(
				new Employee("John", 20000), new Employee("Joe", 30000),
				new Employee("Steve", 40000), new Employee("Hal", 50000)); 
		return list;
	}
}
