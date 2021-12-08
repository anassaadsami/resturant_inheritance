package resturant;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		Time t1 = new Time(16,30);
//		Time t2 = new Time(16,50);
//		Time t3 = new Time(15,30);
//		Time t4 = new Time(17,30);
//		Time t5 = new Time(12,10);
//	
//		Time [] tider = new Time[] {t1,t2,t3,t4,t5};

		Reservation.make_Reservation(input);   
		Reservation.make_Reservation(input);   
		Reservation.make_Reservation(input);   

		for (Time item : Time.reservedTimes) {
			System.out.println(item.toString());
			
		}
		for (Reservation item : Reservation.booking) {
			System.out.println(item.toString());
			
		}
		Arrays.sort(Reservation.booking);  // sorting the array booking by it's time and Arrays.sort used with array[]
		for (Reservation item : Reservation.booking) {
			System.out.println(item.toString());
			
		}
		input.close();
	}
	

//		Reservation [] times = new Reservation[5];
//		times[0]= new Reservation(1, new Time(16,30));  //  we can do also
//		times[1]= new Reservation(2, t2);
//		times[2]= new Reservation(3, t3);
//		times[3]= new Reservation(4, t4);
//		times[4]= new Reservation(5, t5);
//		
//		for (int i = 0; i < times.length; i++) {
//			times[i].displayTime();    
//		}
//		System.out.println();
		

//		Reservation res1 = new Reservation(1,t1);    // the second parameter is object of class Time
//		res1.displayTime();    // display the time of reservation and the table of res1
		
		// make the second reservation
//		Reservation res2 = new Reservation(2,t2);
//		res2.displayTime();     // display the time of reservation and the table of res2
		
//		res1.t.displayTime();    // just display the time of reservation of res1
//		res2.t.displayTime();    // just display the time of reservation of res2
//		
//		int i = res1.compareTo(res2);
//		System.out.println(i);
//		
//		res1.compareTo1(res2);
//		
		
		
//	public static boolean checkTime(Time t) {
//		
//		
//	}
//	

}
