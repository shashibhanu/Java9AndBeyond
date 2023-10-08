package java09;

import java.util.ArrayList;
import java.util.List;

public class SafeVarargsAnnotation { 
	//The @SafeVarargs annotation is used to perform safe operations on variable arguments. A method that accepts variable arguments may cause unsafe execution. To avoid this issue Java provides @SafeVarargs annotation.

	//This annotation can be applied only to methods that cannot be overridden. These include static methods, final instance methods, but from Java 9, can be applied to private instance methods

	@SafeVarargs
	private void display(List... items) {
		for (List item : items) {  
			System.out.println(item);  
		}  
	}
	public static void main(String[] args){
		SafeVarargsAnnotation m = new SafeVarargsAnnotation();  
		List<String> list = new ArrayList<String>();  
		list.add("Book");  
		list.add("Scale");  
		m.display(list);  
	}
}
