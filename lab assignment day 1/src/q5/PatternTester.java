package q5;

import java.util.Scanner;

public class PatternTester {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		Pattern p=new Pattern(n);
		p.printPattern();
		
		sc.close();
	}

}
