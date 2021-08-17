package stringExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringExamples {
	public static void main(String[] args) {
		
		// Count the empty strings
		List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
		
		System.out.println(strList.stream().map(str -> Stream.of(str))
					.peek(System.out::println)
					.distinct().count());

		long emptyStrings=strList.stream()
								.filter(str -> str.length()==0)
								.count();
		System.out.println(emptyStrings);
		
		// Count String with length more than 3 
		long threeLengthStrings=strList.stream()
									.filter(str -> str.length()==3)
									.count();
		System.out.println(threeLengthStrings);
		
		// Remove all empty Strings from List
		strList=strList.stream()
					.filter(str -> str.length()!=0)
					.collect(Collectors.toList());
		strList.forEach(System.out::println);
		
		// Create a String of more than 2 characters (joining)
		String longStrings=strList.stream()
									.filter(str -> str.length()>2)
									.collect(Collectors.joining(" "));
		System.out.println(longStrings);
		
		// Convert String to Uppercase and join them using coma 
		List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
		String capitalStrings=G7.stream()
				.map(str -> str.toUpperCase())
				.collect(Collectors.joining(","));
		System.out.println(capitalStrings);
		

		// Create List of square of all distinct numbers 
		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		List<Integer> distinctSquares=numbers.stream()
											.distinct()
											.map(i -> i*i)
											.collect(Collectors.toList());
		distinctSquares.forEach(System.out::println);
		
	}
}
