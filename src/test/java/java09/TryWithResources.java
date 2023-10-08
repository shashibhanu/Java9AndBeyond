package java09;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TryWithResources {
	//In Java 9, the try-with-resources statement is improved so that we can declare resource(object) outside the try and then pass it into the try statement. See the below example, here we created FileOutputStream object outside the try and later passed its reference to the try-statement.
	//Notice, we did not close the fileStream instance here because now it will be closed automatically.
	public static void main(String[] args) throws FileNotFoundException{
        FileOutputStream fileStream = new FileOutputStream("./src/test/resources/abc.txt");  
        try(fileStream){  
            String greeting = "Hello from Shashi.";      
               byte b[] = greeting.getBytes();       
               fileStream.write(b);      
               System.out.println("File written");           
       }catch(Exception e) {  
           System.out.println(e);  
       }         
	}
}