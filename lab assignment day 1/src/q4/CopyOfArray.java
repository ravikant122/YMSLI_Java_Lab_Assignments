package q4;

import java.util.Scanner;

public class CopyOfArray {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		for(int i=0; i<n; i++)
			arr[i]=sc.nextInt();
		
		int[] barr=CopyOfArray.copyOf(arr);
		for(int i:barr)
			System.out.print(i+" ");
		System.out.println();
		
		sc.close();
	}

	private static int[] copyOf(int[] arr) {
		int[] b=new int[arr.length];
		for(int i:arr)
			b[i]=i;
		return b;
	}
	
}
