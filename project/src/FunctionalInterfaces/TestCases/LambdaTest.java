/**
 * 
 */
package FunctionalInterfaces.TestCases;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import FunctionalInterfaces.Entities.Customer;
import FunctionalInterfaces.Entities.Employee;
import FunctionalInterfaces.Lambda.LambdaMethods;
import javafx.scene.layout.ColumnConstraints;
import junit.framework.Assert;

/**
 * @author USER
 *
 */
class LambdaTest {

	@Test
	void test() {
		Customer cust1 = new Customer("Bob", "11 Adams", "Fairfield", "52556");
		Customer cust2 = new Customer("Laurence Lebihans",	"12, rue des Bouchers",	"Marseille","13008");
		Customer cust3 = new Customer("Andy", "1000 Channing Ave", "Palo Alto", "94301");
		Customer cust4 = new Customer("Zeke", "212 Wilkshire Blvd", "Chicago", "57532");
		Customer cust5 = new Customer("Blauer Delikatessen", "Forsterstr. 57","Mannheim",	"68306");
		List<Customer> list = Arrays.asList(cust1, cust2, cust3, cust4, cust5);		
		
		List<String> Expected = new ArrayList<String>();
		Expected.add(new String("Blauer Delikatessen"));
		Expected.add(new String("Laurence Lebihans"));
			
		assertEquals(LambdaMethods.getCustomerCityName(list, "MA"), Expected);
		
	}
	@Test
	void test1() {
		List<Employee> list = Arrays.asList(
				new Employee("John", 20000), new Employee("Joe", 30000),
				new Employee("Steve", 40000), new Employee("Hal", 50000)); 
		
		
		String expected = "John:20000, Joe:30000, Steve:40000, Hal:50000";
		
		assertEquals(LambdaMethods.allEmployees(list), expected);
		
	}
	
}
