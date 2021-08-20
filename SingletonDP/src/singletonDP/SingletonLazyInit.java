package singletonDP;

public class SingletonLazyInit {

	private static SingletonLazyInit singleton;
	
	private SingletonLazyInit() {}

	public static SingletonLazyInit getInstance() {
		if(singleton==null)
			singleton=new SingletonLazyInit();
		
		return singleton;
	}
}
