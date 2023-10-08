package java09;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIImprovement {

	public static void main(String[] args){ 
		
		//Java takeWhile() Method
		//This method is used to get a stream consisting of a subset of elements taken from this stream 
		//that match the given predicate.
		
		 List<Integer> list   
	        = Stream.of(20,15,30,10,50)  
	                .takeWhile(i -> (i>10)).collect(Collectors.toList());     
	    System.out.println(list);  
	    
	    
		 List<String> list2   
	        = Stream.of("a", "b", "c", "d", "e", "f", "g", "h", "i")  
	                .takeWhile(a->!a.equals("h")).collect(Collectors.toList());     
	    System.out.println(list2); 
	    
	    
	    //Java dropWhile() Method
	    //This method is used to get a subset of stream after the specified predicate. 
	    //It drops all the elements accrued before the specified elements.

	    //In other words, we can say that it returns a stream consisting of the remaining elements 
	    //of this stream after dropping a subset of elements that match the given predicate.
		 List<String> listdropWhile   
	        = Stream.of("a", "b", "c", "d", "e", "f", "g", "h", "i")  
	                .dropWhile(a->!a.equals("h")).collect(Collectors.toList());     
	    System.out.println(listdropWhile); 
	    
		 List<Integer> listdropWhile2   
	        = Stream.of(20,15,30,10,50)  
	                .dropWhile(i -> (i>10)).collect(Collectors.toList());     
	    System.out.println(listdropWhile2); 
	    
	    
	    //Stream: New Iterate Method
	    //A new overloaded method iterate is added to the Java 9 stream interface. 
	    //This method allows us to iterate stream elements till the specified condition.
	    //It takes three arguments, seed, hasNext, and next.
	    
	     Stream<Integer> listN = Stream.iterate(1, i->i<10, i->i+2);
	     List<Integer> listn = listN.collect(Collectors.toList());
	     System.out.println(listn); 
	     
	     //ofNullable() method
	     //Avoiding NullPointerExceptions: 
	     //When you create an Optional using ofNullable(), it can handle the case where the provided value is null. 
	     //This prevents NullPointerExceptions that would occur if you tried to create an Optional using the of() method 
	     //with a null value.
	     
	     String name = null;
	        Optional<String> optionalName = Optional.ofNullable(name);

	        // If name is not null, prints "Hello, John!"
	        // If name is null, prints "Name is not provided."
	        if (optionalName.isPresent()) {
	            System.out.println("Hello, " + optionalName.get() + "!");
	        } else {
	            System.out.println("Name is not provided.");
	        }
	    
	    
	}
	
}
