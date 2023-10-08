package java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadStringWriteString {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("./src/test/resources/Sample.txt");
		Path path2 = Paths.get("./src/test/resources/Sample2.txt");
		System.out.println(Files.readString(path));
		Files.writeString(path2,Files.readString(path));

	}

}
