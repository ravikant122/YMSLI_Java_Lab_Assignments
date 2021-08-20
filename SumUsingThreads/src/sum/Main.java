package sum;

public class Main {

	public static void main(String[] args) {
		Sum s=new Sum(0);
		
		Thread t1=new Thread(s);
		Thread t2=new Thread(s);
		Thread t3=new Thread(s);
		Thread t4=new Thread(s);
		Thread t5=new Thread(s);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("final value = "+s.val);
	}

}
