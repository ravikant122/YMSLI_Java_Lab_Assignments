package singletonDP.reflection;

import java.lang.reflect.Constructor;

import singletonDP.SingletonEarlyInit;

public class BreakingSingleton {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		SingletonEarlyInit s1=SingletonEarlyInit.getInstance();
		SingletonEarlyInit s2=null;
		
		try {
			Constructor[] constructors=SingletonEarlyInit.class.getDeclaredConstructors();
			
			for(Constructor constructor: constructors) {
				constructor.setAccessible(true);
				s2=(SingletonEarlyInit) constructor.newInstance();
				break;
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("instance 1 hashcode = "+s1.hashCode());
		System.out.println("instance 2 hashcode = "+s2.hashCode());
		
	}
}
