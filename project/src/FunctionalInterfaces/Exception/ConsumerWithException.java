package FunctionalInterfaces.Exception;

public interface ConsumerWithException<T> {
	void accept(T t) throws Exception;
}
