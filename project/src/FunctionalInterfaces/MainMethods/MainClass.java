package FunctionalInterfaces.MainMethods;

import java.util.Arrays;
import java.util.List;

import FunctionalInterfaces.Data.DataSource;
import FunctionalInterfaces.Entities.Customer;
import FunctionalInterfaces.Lambda.LambdaMethods;
import FunctionalInterfaces.StaticMethods.Library;


public class MainClass {

	public static void main(String[] args) {
		//ExampleOne();
		ExampleTwo();
	}
	//Task:get all names of customers whose city of residence begins 
	//with "Ma", in sorted order
	public static void ExampleOne() {
		DataSource dt = new DataSource();
		List<Customer> customers =dt.listCustomer();
		
		//show lambda result
		System.out.println(LambdaMethods.getCustomerCityName(customers, "MA"));
		
		//show lambda result with exception
		System.out.println(LambdaMethods.getCustomerCityNameWithException(customers, "MA"));
		
		//show functional interface result
		System.out.println(Library.NAMES_IN_CITY.apply(customers,"MA"));
	}
	public static void ExampleTwo() {
		DataSource ds = new DataSource();		
		String Result = LambdaMethods.allEmployees(ds.listEmployees());
		System.out.println(Result);
		
		System.out.println(Library.LIST_EMPLOYEES.apply(ds.listEmployees()));
		
	}
}
