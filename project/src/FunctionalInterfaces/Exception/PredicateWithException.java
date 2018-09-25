package FunctionalInterfaces.Exception;

public interface PredicateWithException<T> {
	boolean test(T t) throws Exception;
}
