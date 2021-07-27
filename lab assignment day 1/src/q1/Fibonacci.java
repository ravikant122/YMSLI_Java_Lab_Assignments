package q1;

public class Fibonacci {
	private int upto;
	private int[] fibonacciNumbersArray;
	private float average;
	
	public Fibonacci(int upto) {
		this.upto=upto;
		this.fibonacciNumbersArray=this.fibonacciNumbers();
	}
	
	public int getUpto() {
		return this.upto;
	}
	
	public int[] getFibonacciNumbersArray() {
		return this.fibonacciNumbersArray;
	}

	public float getAverage() {
		return this.average;
	}

	private int[] fibonacciNumbers() {
		int a=1,b=1,c;
		this.fibonacciNumbersArray=new int[this.upto];
		this.fibonacciNumbersArray[0]=1;
		this.fibonacciNumbersArray[1]=1;
		int sum=2;
		for(int i=2; i<this.upto; i++) {
			c=a+b;
			this.fibonacciNumbersArray[i]=c;
			sum+=c;
			a=b;
			b=c;
		}
		this.average=(float)sum/this.upto;
		return this.fibonacciNumbersArray;
	}
	
}
