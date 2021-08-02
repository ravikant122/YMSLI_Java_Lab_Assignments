package q1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class ReadAndWriteCommandPrompt {
	public static void main(String[] args)
    {
        try{
        	Path path = Paths.get("C:\\Users\\ve00ym258\\Documents\\workspace-spring-tool-suite-4-4.4.2.RELEASE\\lab assignment day 4\\src\\q1\\text.txt");
            byte[] fileData = Files.readAllBytes(path);

            String str=new String(fileData,StandardCharsets.UTF_8);
            
            System.out.println("printing to console in formatted output");
        	System.out.println(str);
        	
        	System.out.println("printing to console in byte format");
        	System.out.println(Arrays.toString(fileData));
        	
        } catch (IOException e) {
			e.printStackTrace();
		}
    }
}
