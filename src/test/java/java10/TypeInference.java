package java10;

import java.util.Arrays;
import java.util.List;

public class TypeInference {

	public static void main(String[] args) {
		//Java compiler infers the type of variable at compile time
		//Ex: var names = Arrays.asList("Ram", "Mohan", "Shyam");
		//var can not assign null
		//var is not a keyword
		
		List<Integer> num1 = List.of(1,2,3,4);
		List<Integer> num2 = List.of(5,6,7,8);
		
		//Traditional way, but it was confusing in LHS
		List<List<Integer>> num = List.of(num1,num2);
		num.forEach(System.out::println);

		//New way - type inference
		var numnew = List.of(num1,num2);
		numnew.forEach(System.out::println);
		
		//Also instead of
		//for(Integer i:num1)
		for(var i:num1)
		{
			System.out.println(i);
		}
		
		//AlSOOOOOOOOOOOOOOO instead of
		List.of("Ram","Shashi").stream().filter(s->s.length()<5).forEach(System.out::println);
		var filteredNames = List.of("Hari","Shashi").stream().filter(s->s.length()<5);		
			filteredNames.forEach(System.out::println);

	}

}
