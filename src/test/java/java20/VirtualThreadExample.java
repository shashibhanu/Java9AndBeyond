package java20;

import java.util.concurrent.CompletableFuture;

//VirtualThreadExample using CompletableFuture

public class VirtualThreadExample {

    public static void main(String[] args) {
        // Create a virtual thread using CompletableFuture
        CompletableFuture<Void> future1 = CompletableFuture.runAsync(() -> {
            System.out.println("Task 1 is running on virtual thread: " + Thread.currentThread().getName());
        }).thenRun(() -> {
            System.out.println("Task 1 completed!");
        });

        CompletableFuture<Void> future2 = CompletableFuture.runAsync(() -> {
            System.out.println("Task 2 is running on virtual thread: " + Thread.currentThread().getName());
        }).thenRun(() -> {
            System.out.println("Task 2 completed!");
        });

        // Wait for both tasks to complete
        CompletableFuture.allOf(future1, future2).join();

        System.out.println("All tasks are completed!");
    }
}

