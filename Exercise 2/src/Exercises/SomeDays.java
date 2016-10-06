package Exercises;

public class SomeDays {
	public static void main(String[] args){
		Exercise1 myDay = new Exercise1();
		
		System.out.println("Day of week number is "+myDay.getDay());
		System.out.println("Day of week  is "+myDay.toString());
		System.out.println("Set to Sunday");
		myDay.setDay(6);
		System.out.println("Day of week number is "+myDay.getDay());
		System.out.println("Day of week  is "+myDay.toString());
	}
}
