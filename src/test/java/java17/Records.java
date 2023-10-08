package java17;

public class Records {
	
	//**********Records Features************************
	//Eliminates verbosity in creating java beans
	//public accessor methods, constructors, toString(), hashCode(), equals() are automatically created
	//you can create custom implementation if you want
	//Compact constructors are only allowed in records

	
	record Person(String name,String place, int age) {
		//compact constructor (no method signature parameters, no this.name=name)
		Person
		{
			if(name==null)
				throw new IllegalArgumentException("name is null");
		}
		
		public String name()
		{
			System.out.println("custom implementation of name method");
			return name;
		}
		
		public String name2()
		{
			System.out.println("custom implementation of name2 method");
			return "Hi";
		}
	}
	public static void main(String[] args) {
		Person p1 = new Person("Shashi","Pune",20);
		Person p2 = new Person("Shashi2","Pune",20);
		Person p3 = new Person("Shashi","Pune",20);
		//Person p4 = new Person(null,"Pune",20);
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p1.name());
		System.out.println(p1.name2());
		//System.out.println(p4.name());

	}

}
