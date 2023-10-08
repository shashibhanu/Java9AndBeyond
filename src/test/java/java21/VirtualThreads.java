package java21;

public class VirtualThreads {
	public static void main(String[] args) throws InterruptedException {
        // Create a virtual thread
        Thread vThread = Thread.ofVirtual()
                .start(() -> {
                    // Print a message
                    System.out.println("Hello from virtual thread!");
                });

        // Wait for the virtual thread to finish
        vThread.join();

        // Print a message from the main thread
        System.out.println("Hello from main thread!");
    }

}
