package java21;

import java.util.ArrayList;
import java.util.List;
import java.util.SequencedCollection;

public class SequencedCollectionExample2 {
    public static void main(String[] args) {
        // Create a SequencedCollection.
    	ArrayList<Integer> arrayList = new ArrayList<>();

    	arrayList.add(1); 				// [1]

    	arrayList.addFirst(0);	// [0, 1]
    	arrayList.addLast(2);		// [0, 1, 2]

    	System.out.println(arrayList.getFirst());  //0
    	System.out.println(arrayList.getLast());   //2
    	
    	//To understand the benefits:
    	//see how these simple operations were too much verbose in Java 17.
    	System.out.println(arrayList.get( arrayList.iterator().next() )); // first element
    	System.out.println(arrayList.get( arrayList.size() - 1 )); // last element
    	
    	/*
    	 *   
   // new method
  SequencedCollection<E> reversed();

  // methods promoted from Deque
  void addFirst(E);
  void addLast(E);
  E getFirst();
  E getLast();
  E removeFirst();
  E removeLast();
    	 */
    }
}

