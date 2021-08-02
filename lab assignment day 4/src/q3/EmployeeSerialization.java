package q3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeSerialization {

	public static void main(String[] args) {
		Address add=new Address(12,"saini colony","mahesh nagar","jaipur","Rajasthan");
		Employee emp = new Employee("Ravi","YM258",add, 5000);
        String filename = "file.ser";
          
        try
        {   
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
              
            out.writeObject(emp);
            
            out.close();
            file.close();
              
            System.out.println("Employee has been serialized");  
        }
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
	}

}
