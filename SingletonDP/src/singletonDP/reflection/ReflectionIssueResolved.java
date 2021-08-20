package singletonDP.reflection;

enum Singleton {
	INSTANCE;
}

public class ReflectionIssueResolved {

	public static void main(String[] args) {
		System.out.println(Singleton.INSTANCE.hashCode());
	}

}
