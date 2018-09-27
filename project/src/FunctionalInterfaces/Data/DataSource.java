package FunctionalInterfaces.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.event.ListSelectionEvent;

import FunctionalInterfaces.Entities.Congress;
import FunctionalInterfaces.Entities.Customer;
import FunctionalInterfaces.Entities.Employee;
import FunctionalInterfaces.Entities.Person;


public class DataSource {
	public static List<Customer> listCustomer(){
		Customer cust1 = new Customer("Bob", "11 Adams", "Fairfield", "52556");
		Customer cust2 = new Customer("Laurence Lebihans",	"12, rue des Bouchers",	"Marseille","13008");
		Customer cust3 = new Customer("Andy", "1000 Channing Ave", "Palo Alto", "94301");
		Customer cust4 = new Customer("Zeke", "212 Wilkshire Blvd", "Chicago", "57532");
		Customer cust5 = new Customer("Blauer Delikatessen", "Forsterstr. 57","Mannheim","68306");
		Customer cust6 = new Customer("Martin Delikatessen", "Torsterstr. 57","Fairfield","68306");
		List<Customer> list = Arrays.asList(cust1, cust2, cust3, cust4, cust5, cust6);		
		return list;
	}
	
	public static List<Employee> listEmployees(){
		List<Employee> list = Arrays.asList(
				new Employee("John", 20000), new Employee("Ramon", 70000),
				new Employee("Amir", 40000), new Employee("Pedro", 80000),
				new Employee("Carla", 50000), new Employee("Carlos", 90000),
				new Employee("Sarah", 60000), new Employee("Oscar", 100000),
				new Employee("Ramon", 70000), new Employee("Mary", 300000),
				new Employee("Steve", 40000), new Employee("Hal", 500000)); 
		return list;
	}
	
	public static Congress listCongress(){
		Congress congres = new Congress();
		congres.add(new Person ("Sr.","Raul","Castro","Independiente"));
		congres.add(new Person ("Sr.","Hernando","Perez","Independiente"));
		congres.add(new Person ("Sr.","Monica","Delta","Independiente"));
		congres.add(new Person ("Sr.","Ernesto","Guevara","Democrata"));
		congres.add(new Person ("Sr.","Nicolas","Maduro","Democrata"));
		congres.add(new Person ("Sr.","Martin","Vizcarra","Democrata"));
		congres.add(new Person ("Sr.","Pedro","Kuchinski","Democrata"));
		congres.add(new Person ("Sr.","Donald","Trump","Republicano"));
		congres.add(new Person ("Sr.","Hilary","CLinton","Republicano"));
		congres.add(new Person ("Sr.","Obama","Minirdi","Republicano"));
		congres.add(new Person ("Sr.","Ruben","Bravo","Republicano"));
		
		return congres;
	}
	
	public static void main (String[] args) {
		/*List<Employee> employees1 = new ArrayList<Employee>();
		List<Employee> employees2 = new ArrayList<Employee>();
		employees1 = listEmployees();
		employees2 = listEmployees();
		
		List<List<Employee>> listOfList =new ArrayList<>();
		listOfList.add(employees1);
		listOfList.add(employees2);
		
		System.out.println(
		employees1.stream()
					.filter(x->x.getSalary()>40000)
					.map(e-> new Employee(e.getName(),e.getSalary()))
					.sorted()
					.collect(Collectors.toList())
		);
		
	
		System.out.println(
					listOfList.stream().reduce(new ArrayList<Employee>(),(x,y)->{
						x.addAll(y);
						//System.out.println(x.toString());
						return x;
					}).sort(Comparator.comparing(x->x.getClass().getName()))
 
				);
		*/
	}
	
}
