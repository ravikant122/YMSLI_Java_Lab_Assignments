package q7;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import q6.InputException;

public class ExceptionalClass extends Exception {
	private static final long serialVersionUID = 1L;
	
	public void ExceptionalMethod(int input) {
		try {
			if(input>100)
				throw new InputException("InputException occured");
			InputStream f=new FileInputStream("text.txt");
			int c;
			if((c=f.read())!=-1) {
				System.out.println(c);
			}
			f.close();
		}catch(InputException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println("this is IOException");
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
