package resturant;

import java.util.Scanner;

public class Reservation implements Comparable<Reservation>{
	
//	int talbleNum ;
	static int i = 0;
	String name ;
	Time t ;      // reference variable of Time class (as an instance variable for Reservation class)
	static Reservation [] booking = new Reservation[3];
	
	public Reservation(String name , Time t) {    // constructor
		this.name = name;
		this.t = new Time(t.hour ,t.minutes);      // create an object of Time class we can code (this.t= t)
//		this.t = t ;    // the same
	}
	// method to create an object of Reservation class and return it 
	public static Reservation make_Reservation(Scanner input) {
		System.out.println("enter your name and which time do you want:");
		String name = input.next();
		Time t = Time.addToReservedTimes2(input);
		Reservation reserv = new Reservation(name , t);     // t is object from Time class
		booking[i++]= reserv ;
		return reserv ;
	}
	@Override
	public String toString() {
		return "Reservation [name=" + name + ", t=" + t + "]";
	}
	// method to show the time of reservation and the no of table
	public void displayTime() {
		System.out.printf("reservation at %d:%d on the table no:%d\n",this.t.hour, this.t.minutes , this.name);
	}
	
	
	// method to compare between two reservation's time and show which is the first and which is later
	@Override
	public int compareTo(Reservation reserv) {
		if(this.t.hour < reserv.t.hour  || (this.t.hour == reserv.t.hour && this.t.minutes < reserv.t.minutes ))
		   return -1;
		else if(this.t.hour > reserv.t.hour  || (this.t.hour == reserv.t.hour && this.t.minutes > reserv.t.minutes ))
		    return 1 ;
		else 
			return 0;
		
	}
//	// this method is not belong to Comparable class 
//	public void compareTo1(Reservation reserv) {
//		if(this.t.hour < reserv.t.hour  || (this.t.hour == reserv.t.hour && this.t.minutes < reserv.t.minutes ))
//			System.out.println(this.talbleNum +" before "+ reserv.talbleNum);
//		else if(this.t.hour > reserv.t.hour  || (this.t.hour == reserv.t.hour && this.t.minutes > reserv.t.minutes ))
//			System.out.println(this.talbleNum +" after "+ reserv.talbleNum);
//		else 
//			System.out.println(this.talbleNum +" and "+ reserv.talbleNum +" in the same time.");
//		
//	}

}
