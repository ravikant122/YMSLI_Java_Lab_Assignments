package singletonDP.serialization;

import java.io.Serializable;

public class Singleton implements Serializable {
	private static final long serialVersionUID = 7823943132398477243L;

	private static final Singleton singleton = new Singleton();
	
	public Singleton() {}

	public static Singleton getInstance() {
		return singleton;
	}
	
}
