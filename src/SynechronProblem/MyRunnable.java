package SynechronProblem;

/**
 * @author utpal on June, 2020
 */
public class MyRunnable implements Runnable {
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(Thread.currentThread().getName() + " started");

		try {
				Thread.currentThread().sleep(1000);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(Thread.currentThread().getName() + " ended");
	}




}
