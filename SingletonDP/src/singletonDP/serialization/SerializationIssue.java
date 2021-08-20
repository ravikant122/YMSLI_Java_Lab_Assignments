package singletonDP.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializationIssue {
	
	public static void main(String[] args) {
		try {
			Singleton s1=Singleton.getInstance();
			ObjectOutput out=new ObjectOutputStream(new FileOutputStream("file.ser"));
			out.writeObject(s1);
			out.close();
			
			ObjectInput in=new ObjectInputStream(new FileInputStream("file.ser"));
			Singleton s2=(Singleton) in.readObject();
			in.close();
			
			System.out.println(s1.hashCode());
			System.out.println(s2.hashCode());
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
