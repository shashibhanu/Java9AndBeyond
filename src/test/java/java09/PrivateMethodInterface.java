package java09;

interface Printable{
	private void print() {
		System.out.println("print...");
	}
	default void print3D() {
		// Calling private method
		print();
	}
}

public class PrivateMethodInterface implements Printable {
	public static void main(String[] args){
		Printable p = new PrivateMethodInterface();
		p.print3D();
	}
}

