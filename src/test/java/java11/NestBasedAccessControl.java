package java11;

public class NestBasedAccessControl {
//	Previous Java versions allowed access of private members to nested classes(nestmates), 
//	but we cannot use them with the Reflection API. 
//	Java 11 no longer uses bridge methods and provides the getNestHost(), getNestMembers(), 
//	and isNestmatOf() methods for the Reflection API.

	private void privateMethod() {
        System.out.print("Private Method");
    }
    class NestedClass {
        public void callPrivateMethod() {
            privateMethod();
        }
    }
    public static void main(String[] args) {
        System.out.println(NestBasedAccessControl.class.isNestmateOf(NestBasedAccessControl.NestedClass.class)); //Demo class is nestmate of NestedClass
        System.out.println(NestBasedAccessControl.NestedClass.class.isNestmateOf(NestBasedAccessControl.class)); //NestedClass is nestmate of Demo class		
        System.out.println(NestedClass.class.isNestmateOf(NestBasedAccessControl.class));//same as above
        System.out.println(NestBasedAccessControl.NestedClass.class.getNestHost()); //Nest host of NestedClass
        System.out.println(NestBasedAccessControl.class.getNestMembers()); //Nest host of Demo class		
    }

}
