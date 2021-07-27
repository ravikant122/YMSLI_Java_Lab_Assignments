package q1;

import java.util.Scanner;

public class FibonacciTester {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		Fibonacci fib = new Fibonacci(n);
		FibonacciTester.printFibonacciArray(fib.getFibonacciNumbersArray());
		FibonacciTester.printFibonacciAverage(fib.getAverage());
		
		sc.close();
	}

	private static void printFibonacciArray(int[] fibonacciNumbersArray) {
		
		System.out.println("The first 20 Fibonacci numbers are:");
		for(int i:fibonacciNumbersArray)
			System.out.print(i+" ");
		System.out.println();
		
	}
	
	private static void printFibonacciAverage(float average) {
		
		System.out.println("The average is "+average);
		System.out.println();
		
	}

}
