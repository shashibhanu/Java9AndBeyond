package java21;

record Point(int x, int y) {}

public class RecordPatternExample {
    public static void main(String[] args) {

    	Point obj = new Point(1,2);
    	//Record Pattern is a preview feature and disabled by default. Use --enable-preview to enable
//    	if (obj instanceof Point(int x, int y)) {
//
//    	    System.out.println(x+y);
//    	}
    	
    }
}

