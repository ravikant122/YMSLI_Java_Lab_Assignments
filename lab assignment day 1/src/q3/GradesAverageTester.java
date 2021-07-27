package q3;

import java.util.Scanner;

public class GradesAverageTester {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		GradesAverage ga=new GradesAverage(n);
		for(int i=0; i<n; i++) {
			System.out.println("Enter the grades of student"+(i+1));
			if(!ga.putGrade(sc.nextInt())) {
				System.out.println("Invalid grade, try again...");
			}
		}
		
		System.out.println(ga.getAverage());
		sc.close();
	}
}