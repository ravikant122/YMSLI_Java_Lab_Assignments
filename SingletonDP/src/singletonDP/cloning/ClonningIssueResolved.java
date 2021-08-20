package singletonDP.cloning;

class NewbaseSingleton implements Cloneable {
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class NewSingleton extends baseSingleton {
	public static final NewSingleton singleton = new NewSingleton();
	
	private NewSingleton() {}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}

public class ClonningIssueResolved {
	public static void main(String[] args) {
		NewSingleton s1=NewSingleton.singleton;
		try {
			NewSingleton s2=(NewSingleton) s1.clone();
		
			System.out.println(s1.hashCode());
			System.out.println(s2.hashCode());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
