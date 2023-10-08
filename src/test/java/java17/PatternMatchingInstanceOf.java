package java17;

public class PatternMatchingInstanceOf {
    /**
     * Pattern matching for instanceof performing casts after type comparisons.
     */

    public static void main(String[] args){
        Object o = "I am a string as an object";
        if (o instanceof String str) {
            System.out.println(str.toUpperCase());
        }

        //The following code is also valid:
        if (o instanceof String str && !str.isEmpty()) {
            System.out.println(str.toUpperCase());
        }

        Object obj = 123;

        //The following code is also valid:
        if (!(obj instanceof String str)) {
            throw new RuntimeException("Please provide string!");
        }
    }
}
