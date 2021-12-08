package resturant;

import java.util.Scanner;

public class Time implements Comparable<Time> {

	int hour;
	int minutes;
	static int i = 0;
	static Time[] reservedTimes = new Time[Reservation.booking.length]; // we have just 5 times a day for reservations 

	public Time(int hour, int minutes) {
		this.hour = hour;
		this.minutes = minutes;
	}
	// method create an object of Time class and add it to the reservedTimes array 
	public static Time[] addToReservedTimes(Scanner input) {
		for (int i = 0; i < reservedTimes.length; i++) {
			System.out.print("enter reservation no: " + (i + 1));
			int hour = input.nextInt();
			int minutes = input.nextInt();
			reservedTimes[i] = new Time(hour, minutes); // we can code new Time(input.nextInt(),input.nextIn()) the same
		}
		return reservedTimes;
	}
	// method create an object of Time class and return it 
	public static Time addToReservedTimes2(Scanner input) {
		
			System.out.print("enter reservation time (hour , minutes): ");
			int hour = input.nextInt();
			int minutes = input.nextInt();
			Time t = new Time(hour, minutes); // we can code new Time(input.nextInt(),input.nextIn()) the same
			Time.reservedTimes[i++]= t ;
		
		return t;
	}

	public void displayTime() {
		System.out.printf("reservation at %d:%d\n", this.hour, this.minutes);
	}

	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minutes=" + minutes + "]";
	}

	@Override
	public int compareTo(Time t) {
		if (this.hour == t.hour && this.minutes == t.minutes)
			return 0;
		else if (this.hour > t.hour && this.minutes > t.minutes)
			return 1;
		else
			return -1;
	}

}
