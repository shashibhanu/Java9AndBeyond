package java11;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNot {

	public static boolean isEven(Integer number)
	{
		return number%2==0;
	}
	public static void main(String[] args) {
		List<Integer> num = List.of(1,2,3,4,5,6);
		
		Predicate<Integer> evennum = n->n%2==0;
		
		num.stream().filter(evennum).forEach(System.out::println);
		
		//to get odd numbers
		num.stream().filter(evennum.negate()).forEach(System.out::println);
		
		//but we can not do negate() if we are using methods reference instead of predicate
		num.stream().filter(PredicateNot::isEven).forEach(System.out::println); // for even numbers
		num.stream().filter(Predicate.not(PredicateNot::isEven)).forEach(System.out::println); // for odd numbers

	}
	
	

}
