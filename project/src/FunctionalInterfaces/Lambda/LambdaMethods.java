package FunctionalInterfaces.Lambda;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import FunctionalInterfaces.Entities.Customer;
import FunctionalInterfaces.Entities.Employee;
import FunctionalInterfaces.Exception.PredicateWithException;
import FunctionalInterfaces.Exception.BiConsumerWithException;
import FunctionalInterfaces.Exception.ConsumerWithException;
import FunctionalInterfaces.Exception.FunctionWithException;


public class LambdaMethods {
	
	//Task:get all names of customers whose city of residence begins 
	//with "Ma", in sorted order
	public static List<String> getCustomerCityName(List<Customer> list,String s){
		List<String> listStr = list
				.stream()
				.filter(cust -> cust.getCity().toLowerCase()
						.startsWith(s.toLowerCase()))
				.map(cust -> cust.getName())							   
				.sorted()
				.collect(Collectors.toList());
		return listStr;
	}
	
	//Task:get all names of customers whose city of residence begins 
	//with "Ma", in sorted order
	public static List<String> getCustomerCityNameWithException(List<Customer> list,String s){
		List<String> listStr = list
				.stream()
				.filter(cust -> uncheckedBoolean((String x)->x.startsWith(s.toLowerCase())).test(cust.getCity().toLowerCase()))
				.map(cust -> cust.getName())							   
				.sorted()
				.collect(Collectors.toList());
		return listStr;
	}
	
	
	public static <T> Predicate<T> uncheckedBoolean(PredicateWithException<T> f) {
		return x -> {	
			try {
				return f.test(x);
			} catch(Exception e) {
				throw new RuntimeException(e);
			}
		};
	}
	
	
	public static String allEmployees(List<Employee> employees) {
		return employees.stream()
				//.map(Object::toString)
				.map(x-> uncheckedString(s-> x.toString()).apply(x))
				.collect(Collectors.joining(", "));
	}
	
	public static <T, R> Function<T,R> uncheckedString(FunctionWithException<T,R> f) {
		return x -> {	
			try {
				return f.apply(x);
			} catch(Exception e) {
				throw new RuntimeException(e);
			}
		};
	}
	
	//show employess that are from fairfield
	public static void employeeFromCity(List<Customer> employees, String City) {
		 		employees
				.stream()
				.filter(x->x.getCity().equals(City))
				.map(x->x.getName())
				.distinct()
				.collect(Collectors.toList())
				.forEach(System.out::println);
	}
	public static void employeeFromCityWithException(List<Customer> employees, String City) {
 		employees
		.stream()
		.filter(x->x.getCity().equals(City))
		.map(x->x.getName())
		.distinct()
		.collect(Collectors.toList())
		.forEach(wrapperConsumer(System.out::println));
}
	
	
	public static <T> Consumer<T> wrapperConsumer(ConsumerWithException<T> f) {
		return x -> {	
			try {
				f.accept(x);
			} catch(Exception e) {
				throw new RuntimeException(e);
			}
		};
	}
	
	//Represent each int[] in the list as a string so it can be printed,
	//mapping Arrays.toString to each int[] in the list
	public static void infStream() {
		List<int[]> intArrs = Stream.iterate(BigInteger.ONE, n -> n.add(BigInteger.ONE)).limit(20)
				.map(x -> x.intValue())
                .map(int[]::new)
                .collect(Collectors.toList());

		List<String> intArrsStr = intArrs.stream().map(Arrays::toString).collect(Collectors.toList());
		System.out.println(intArrsStr);	
	}
	
	
	
	
}
