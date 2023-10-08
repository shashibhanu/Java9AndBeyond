package java21;

import java.util.HashMap;
import java.util.Map;

public class TemplateString {

	public static void main(String[] args) {
//		String name = "Lokesh";	
//
//		//STR
//		String message = STR."Greetings \{name}.";
//
//		//FMT
//		String message = STR."Greetings %-12s\{name}.";
//
//		//RAW
//		StringTemplate st = RAW."Greetings \{name}.";
//		String message = STR.process(st);
		
        // Create a map to store the template variables.
        Map<String, Object> variables = new HashMap<>();
        variables.put("name", "Alice");
        variables.put("age", 25);

        // Create a template string.
        String templateString = "Hello, {name}! You are {age} years old.";

        //as the StringTemplate class is a preview feature in Java 21. Preview features are not yet part of the Java standard library, so they are not available to all Java compilers.
        //To fix the compilation error, you need to use a Java compiler that supports Java 21 preview features. You can do this by setting the --enable-preview flag when you compile your code
        //use javac --enable-preview TemplateStringExample.java
        
        //String evaluatedTemplateString = StringTemplate.format(templateString, variables);//String evaluatedTemplateString = StringTemplate.of(templateString);

        // Print the evaluated template string to the console.
        System.out.println(templateString);

	}

}
