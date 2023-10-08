package java21;

import java.util.concurrent.Executors;

public class VirtualThreadvsPlatformThread {
	public static void main(String[] args) {
		Runnable runnable = () -> System.out.println("Inside Runnable");

		//Platform Thread
		Thread platforThread = Thread.ofPlatform().name("Platform Thread").start(runnable);
		System.out.println(platforThread.isVirtual());
		
		//Virtual Thread
		Thread virtualThread = Thread.ofVirtual().name("Virtual Thread").start(runnable);
		System.out.println(virtualThread.isVirtual());

    }
}
