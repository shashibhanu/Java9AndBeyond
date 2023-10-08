package java15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VirtualThreadPoolExample {
	public static void main(String[] args) {
        // Create a virtual thread executor service
        //ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor();
		ExecutorService executorService = Executors.newFixedThreadPool(10);
        // Submit a few tasks to the executor service

        for (int i = 0; i < 100; i++) {
        	final int taskNumber = i; // Create a final variable
            executorService.submit(() -> {
                System.out.println("Running thread " + taskNumber);
            });
        }

        // Shut down the executor service
        executorService.shutdown();
    }

}
