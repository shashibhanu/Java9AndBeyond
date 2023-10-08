package java14;

public class SwitchExpression {
	
	public static String dayOfTheWeek(int day)
	{
		String dayoftheweek = "";
		switch(day) {
		case 1: dayoftheweek = "monday" ; break;
		case 2: dayoftheweek = "tuesday" ; break;
		case 3: dayoftheweek = "wednesday" ; break;
		case 4: dayoftheweek = "friday" ; break;
		default: throw new IllegalArgumentException("Invalid choice: "+day);
		}
		return dayoftheweek;
	}
	
	public static String dayOfTheWeekNew(int day)
	{
		String dayoftheweek = 
		switch(day) {
		case 1 -> "monday" ;
		case 2 -> "tuesday" ;
		case 3 -> 
		    {
			System.out.println("multiple line switch lambda expression");
		    yield "wednesday";
		    }
		case 4 -> "friday" ;
		default -> throw new IllegalArgumentException("Invalid choice: "+day);
		};
		return dayoftheweek;
	}

	public static void main(String[] args) {
		System.out.println(dayOfTheWeek(2));
		System.out.println(dayOfTheWeekNew(3));

	}

}
