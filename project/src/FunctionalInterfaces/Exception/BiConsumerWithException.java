package FunctionalInterfaces.Exception;

import java.util.List;

import FunctionalInterfaces.Entities.Customer;

public interface BiConsumerWithException<T,U> {
	void accept(List<Customer> l,String s) throws Exception;
}
