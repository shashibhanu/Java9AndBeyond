package java15;

public class TextBlock {

	public static void main(String[] args) {
		System.out.println("""
				this is
				    "Shashi'
				       Bhanu
				""");
		
		System.out.println("""
				Line1: %s
				Line2: %d
				""".formatted("Shashi",20));

	}

}
