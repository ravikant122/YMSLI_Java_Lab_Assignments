package singletonDP;

public class SingletonStaticBlockInit {
	private static SingletonStaticBlockInit singleton;
	
	private SingletonStaticBlockInit() {}

	static {
		singleton = new SingletonStaticBlockInit();
	}
	
	public static SingletonStaticBlockInit getInstance() {
		return singleton;
	}
	
}
