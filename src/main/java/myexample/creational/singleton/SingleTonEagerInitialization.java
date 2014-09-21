package myexample.creational.singleton;

public class SingleTonEagerInitialization {

	private static final SingleTonEagerInitialization instance = new SingleTonEagerInitialization();

	// private constructor to avoid client applications to use constructor
	private SingleTonEagerInitialization() {
	}

	public static SingleTonEagerInitialization getInstance() {
		return instance;
	}
}