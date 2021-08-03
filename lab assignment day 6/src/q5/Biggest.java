package q5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Biggest {

	public static void main(String[] args) {
		File file=new File("C:\\Users\\ve00ym258\\Documents\\workspace-spring-tool-suite-4-4.4.2.RELEASE\\lab assignment day 6\\src\\q5\\text.txt");
		Double mx=0.0;
		try(BufferedReader br=new BufferedReader(new FileReader(file))){
			String st;
			while((st=br.readLine())!=null) {
				Double temp=Double.parseDouble(st);
				mx=Math.max(mx, temp);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("biggest number is "+mx);
	}

}
