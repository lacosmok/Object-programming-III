package Exercises;
import java.util.*;
import java.text.*;

public class Exercise1 {
	private int day;

	public Exercise1(){
		this.day =0;
		System.out.println("Monday");
	}
	public void setDay(int day){
		if((day<0)||(day>6)){
			System.out.println("Day Numbret out of range!");
		this.day = 0;
		}
		else{
			this.day = day;
		}
		
	}
	public int getDay(){
		return this.day;
	}
	public void nextDay(){
		if(this.day==6){
			this.day=0;
		}
		else{
			this.day++;
		}
	}
	public void previousDay(){
		if(this.day==0){
			this.day=6;
		}
		else{
			this.day--;
		}
	}
	public String toString(){
		switch(this.day){
		case 0:
			return "Monday";
		case 1:
			return "Tuesday";
		case 2:
			return "Wendsday";
		case 3:
			return "Thurstday";
		case 4:
			return "Friday";
		case 5:
			return "Saturday";
		case 6:
			return "Sunday";
		default:
			System.out.println("Cool!");
			return "Monday";
		
		}
		
	}
}
