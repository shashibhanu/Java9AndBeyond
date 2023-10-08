package java10;

import java.util.ArrayList;
import java.util.List;

public class UseOfcopyOf {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
        names.add("Ram");
        names.add("Shyam");
        names.add("mohan");
        
        //ways to create unmodifiable list
        //Method-1
        //List<String> names2 = List.of("Ram","Mohan","Shyam");
        //Method-2
        //List<String> names2 = List.copyOf(names);
        doNotChange(names);
        names.forEach(System.out::println);
	}
	
	public static void doNotChange(List<String> namesarg)
	{
		namesarg.add("Shashi");
	}

}
