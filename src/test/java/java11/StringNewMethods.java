package java11;

import java.util.List;
import java.util.stream.Collectors;

public class StringNewMethods {
	public static void checkisBlank()
	{
		String s1 = "";
		String s2 = "    ";
		String s3 = "String";
		
		System.out.println("s1 is blank: " + s1.isBlank());
		System.out.println("s2 is blank: " + s2.isBlank());
		System.out.print("s3 is blank: " + s3.isBlank());
	}

	
	public static void checklines()
	{
        String s = "This\n is\n a\n String";
		
		List<String> listOfLines = s.lines().collect(Collectors.toList());
		System.out.print(listOfLines);
	}
	
	public static void checkrepeat()
	{
		String s = "String";
		
		System.out.println("String: " + s);
		System.out.println("String repeated twice: " + s.repeat(2));
		System.out.print("String repeated five times: " + s.repeat(5));
	}
	
	public static void checkstrip()
	{
		String s = "  string  ";
		System.out.println("$" + s + "$");
		System.out.println("$" + s.strip() + "$");
		System.out.println("$" + s.stripLeading() + "$");
		System.out.println("$" + s.stripTrailing() + "$");
	}
	
	public static void main(String[] args) {
		checkisBlank();
		System.out.println("\n"+"**************************************************************"+"\n");
		checklines();
		System.out.println("\n"+"**************************************************************"+"\n");
		checkrepeat();
		System.out.println("\n"+"**************************************************************"+"\n");
		checkstrip();

	}

}
