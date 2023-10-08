package java21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VirtualThreadWays {
	public static void main(String[] args) {
		Runnable runnable = () -> System.out.println("Inside Runnable");

		//1 - create a virtual thread and start it
		Thread.startVirtualThread(runnable);

		//2 - create a virtual thread and start it
		Thread virtualThread1 = Thread.ofVirtual().start(runnable);
		
		//3 - create a virtual thread and start it, also use name
		Thread virtualThread2 = Thread.ofVirtual().name("thread2").start(runnable);

		//4 - create a virtual thread and use start() to start it, also use name
		Thread virtualThread3 = Thread.ofVirtual().name("thread3").unstarted(runnable);
		virtualThread3.start();
		
		//5
		var executor = Executors.newVirtualThreadPerTaskExecutor();
		executor.submit(runnable);
    }

}
