package singletonDP.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SingletonResolved implements Serializable {
	private static final long serialVersionUID = 7823943132398477243L;

	public static final SingletonResolved singleton = new SingletonResolved();
	
	public SingletonResolved() {}
	
	protected Object readResolve() {
		return singleton;
	}
	
}

public class SerializationIssueResolved {
	public static void main(String[] args) {
		try {
			SingletonResolved s1=SingletonResolved.singleton;
			ObjectOutput out=new ObjectOutputStream(new FileOutputStream("file.ser"));
			out.writeObject(s1);
			out.close();
			
			ObjectInput in=new ObjectInputStream(new FileInputStream("file.ser"));
			SingletonResolved s2=(SingletonResolved) in.readObject();
			in.close();
			
			System.out.println(s1.hashCode());
			System.out.println(s2.hashCode());
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
