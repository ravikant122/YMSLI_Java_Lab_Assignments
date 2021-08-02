package q2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharStreamReadWrite {

	public static void main(String[] args) {
		String outputFilePath="C:\\Users\\ve00ym258\\Documents\\workspace-spring-tool-suite-4-4.4.2.RELEASE\\lab assignment day 4\\src\\q2\\text.txt";
		File outputFile=new File(outputFilePath);
		
		try (BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter out=new BufferedWriter(new FileWriter(outputFile))) {
			System.out.println("Enter the text");
			String str;
			while(!(str=in.readLine()).equals("")) {
				out.write(str+"\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("writing is completed");
		
		System.out.println("Reading starts from file");
		try(BufferedReader in=new BufferedReader(new FileReader(outputFile));){
			String str;
			while((str=in.readLine())!=null)
				System.out.println(str);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
        System.out.println("Reading completed");
	}

}
