package q1;

import java.util.Scanner;

public class CircleTester {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of Circle");
		int n=sc.nextInt();
		
		Circle c=new Circle(n);
		System.out.println(c.getArea());
		
		sc.close();

	}

}
