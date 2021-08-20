package sum;

import java.util.Random;

public class Sum implements Runnable{
	int val;
	
	public Sum(int val) {
		this.val = val;
	}

	public void run() {
		Random rand=new Random();
		int n=rand.nextInt(10)+1;
		System.out.println("Generated random number by " + Thread.currentThread().getName() + " is "+ n);
		synchronized (this) {
			val+=n;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Number added by " + Thread.currentThread().getName() + " is "+ n);
	}

}
