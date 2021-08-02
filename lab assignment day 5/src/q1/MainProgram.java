package q1;

public class MainProgram {

	public static void main(String[] args) {
		Thread t1=new Thread(new ThreadedOneToHundread());
		Thread t2=new Thread(new ThreadedOneToHundread());
		Thread t3=new Thread(new ThreadedOneToHundread());
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("All threaded succefully terminated");
	}

}
