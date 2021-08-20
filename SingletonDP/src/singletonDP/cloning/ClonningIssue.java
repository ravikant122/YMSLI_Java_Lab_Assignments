package singletonDP.cloning;

class baseSingleton implements Cloneable {
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class Singleton extends baseSingleton {
	public static final Singleton singleton = new Singleton();
	
	private Singleton() {}

}

public class ClonningIssue {
	public static void main(String[] args) {
		Singleton s1=Singleton.singleton;
		try {
			Singleton s2=(Singleton) s1.clone();
		
			System.out.println(s1.hashCode());
			System.out.println(s2.hashCode());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
