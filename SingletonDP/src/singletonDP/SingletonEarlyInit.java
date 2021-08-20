package singletonDP;

public class SingletonEarlyInit {

	private static final SingletonEarlyInit singleton = new SingletonEarlyInit();
	
	private SingletonEarlyInit() {}

	public static SingletonEarlyInit getInstance() {
		return singleton;
	}
	
}
