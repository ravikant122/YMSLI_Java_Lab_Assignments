package singletonDP;

public class SingletonThreadSafe {
	
	private static SingletonThreadSafe singleton;
	
	private SingletonThreadSafe() {}
	
	public static SingletonThreadSafe getInstance() {
		if(singleton==null) {
			synchronized(SingletonThreadSafe.class) {
				if(singleton==null)
					singleton=new SingletonThreadSafe();
			}
		}
		return singleton;
	}
}
