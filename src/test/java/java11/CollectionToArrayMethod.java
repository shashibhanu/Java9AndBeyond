package java11;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionToArrayMethod {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(10);
		list.add(15);
		
		Integer[] intArr = list.toArray(Integer[]::new);
		System.out.print(Arrays.toString(intArr));

	}

}
