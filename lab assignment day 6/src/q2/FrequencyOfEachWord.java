package q2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FrequencyOfEachWord {

	public static void main(String[] args) {
		  
	    Map<String,Integer> mp=new HashMap<>();
	    String st;
	    try(BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Users\\ve00ym258\\Documents\\workspace-spring-tool-suite-4-4.4.2.RELEASE\\lab assignment day 6\\src\\q2\\text.txt")))) {
		  while ((st = br.readLine())!=null) {
			  String[] words=st.split(" " );
			  for(String s:words) {
				  if(mp.containsKey(s)) {
					  mp.put(s, mp.get(s)+1);
				  }else {
					  mp.put(s, 1);
				  }
			  }
		  }
		  
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	    System.out.println("-------- Frequency of words ---------");
	    for(Entry<String,Integer> e:mp.entrySet()) {
	    	System.out.println(e.getKey() + " appear " + e.getValue() + " times");
	    }
	}

}
