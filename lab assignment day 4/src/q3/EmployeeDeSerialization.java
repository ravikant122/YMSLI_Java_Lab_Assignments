package q3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeDeSerialization {

	public static void main(String[] args) {
		Employee emp=null;
		String filename="file.ser";
		try
        {   
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
              
            emp = (Employee)in.readObject();
              
            in.close();
            file.close();
              
            System.out.println("Object has been deserialized ");
            emp.display();
        }
          
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
          
        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }
	}

}
