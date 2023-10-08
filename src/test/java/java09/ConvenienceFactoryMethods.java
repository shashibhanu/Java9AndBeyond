package java09;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ConvenienceFactoryMethods {

	public static void main(String[] args) {
        List<String> names = List.of("Ram","Mohan","Shyam");
        names.forEach(System.out::println);
        
        Set<String> fruitsset = Set.of("Orange","Mango","Apple");
        System.out.println(fruitsset);
        // Traversing using for-each
        for (String fruit : fruitsset) {
			System.out.println(fruit);
		}
        
        
        Map<Integer,String> fruits = Map.of(101,"Orange",102,"Mango",103,"Apple");
        System.out.println(fruits);
        // Traversing using for-each
        for(Map.Entry<Integer, String> m : fruits.entrySet()){    
			System.out.println(m.getKey()+" "+m.getValue());
		}
        
        
        
        Map<Integer, String> fruits2 = Map.ofEntries(
                Map.entry(101,"Orange"),
                Map.entry(102, "Apple"),
                Map.entry(103, "Mango"));
        System.out.println(fruits2);
        // Traversing using for-each
        for(Map.Entry<Integer, String> m : fruits2.entrySet()){    
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
