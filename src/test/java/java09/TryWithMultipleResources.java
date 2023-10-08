package java09;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TryWithMultipleResources {
	//In Java 9, the try-with-resources statement is improved so that we can declare resource(object) outside the try and then pass it into the try statement. See the below example, here we created FileOutputStream object outside the try and later passed its reference to the try-statement.
	//Notice, we did not close the fileStream instance here because now it will be closed automatically.
	public static void main(String[] args) throws FileNotFoundException{ 
		FileInputStream fileStream = new FileInputStream("./src/test/resources/abc.txt");
		BufferedInputStream bufferedInput = new BufferedInputStream(fileStream);
		try( fileStream; 
				bufferedInput;
				)
		{  
			int data = bufferedInput.read();
			while(data != -1){
				System.out.print((char) data);
				data = bufferedInput.read();
			}        
		}catch(Exception e) {  
			System.out.println(e);  
		}  
}
}