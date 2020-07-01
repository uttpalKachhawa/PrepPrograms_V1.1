package SynechronProblem;

/**
 * @author uttpal on Jun, 2020
 */

public class ThreadSequanceMain {
	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread(new MyRunnable());
		Thread t2=new Thread(new MyRunnable());
		Thread t3=new Thread(new MyRunnable());
		Thread t4=new Thread(new MyRunnable());
		Thread t5=new Thread(new MyRunnable());
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		t3.setName("Thread-3");
		t4.setName("Thread-4");
		t5.setName("Thread-5");
		t2.start();
		t2.join();
		t5.start();
		t5.join();
		t4.start();
		t4.join();
		t1.start();
		t1.join();
		t3.start();
		t3.join();

		Thread tt=new Thread(new MyRunnable1());
		Thread ttt=new Thread(new MyRunnable1());
		Thread tttt=new Thread(new MyRunnable1());
		Thread ttttt=new Thread(new MyRunnable1());
		Thread tttttt=new Thread(new MyRunnable1());

		tt.setName("Thread-1");
		ttt.setName("Thread-2");
		tttt.setName("Thread-3");
		ttttt.setName("Thread-4");
		tttttt.setName("Thread-5");
		tt.start();
		tt.join();
		ttt.start();
		ttt.join();
		tttt.start();
		tttt.join();
		ttttt.start();
		ttttt.join();
		tttttt.start();
		tttttt.join();



		
		
	}

}
