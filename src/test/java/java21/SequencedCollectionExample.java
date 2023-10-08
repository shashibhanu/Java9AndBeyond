package java21;

import java.util.ArrayList;
import java.util.List;
import java.util.SequencedCollection;

public class SequencedCollectionExample {
    public static void main(String[] args) {
        // Create a SequencedCollection.
        SequencedCollection<String> sequencedCollection = new ArrayList<>();

        // Add elements to the sequenced collection.
        sequencedCollection.add("one");
        sequencedCollection.add("two");
        sequencedCollection.add("three");

        // Get the first element in the sequenced collection.
        String firstElement = sequencedCollection.getFirst();

        // Get the last element in the sequenced collection.
        String lastElement = sequencedCollection.getLast();

        // Print the first and last elements to the console.
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);
    }
}

