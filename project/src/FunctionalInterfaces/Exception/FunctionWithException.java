package FunctionalInterfaces.Exception;

public interface FunctionWithException<T, R> {
	R apply(T t) throws Exception;
}
