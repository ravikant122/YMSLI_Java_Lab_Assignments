package q1;

public class ThreadedOneToHundread implements Runnable {

	@Override
	public void run() {
		try {
			for(int i=1; i<=100; i++) {
				System.out.println(Thread.currentThread().getName() + " : " + i);
				Thread.sleep(100);
			}
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

}
