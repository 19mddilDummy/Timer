//import static user.*;
import java.util.Calendar;
class time{
	public static void main(String[] args){
		plan p1 = new plan();
		plan p2 = new plan();
		///use user class to set it....
		System.out.println("\n\n114 Days for a wife");
		System.out.println("Main Goal is to work 14-12 hours a day\n\n");
		System.out.println("You are defined by your own actions.\n\n");
		p1.set(20,2,2020,114);/// if I want to end it in 69 days from 14/06 with +12 hours
		p1.find_ending_date();
		p1.days_passed();
		p1.time_remains();
		System.out.println();
		System.out.println("Doing web development with java and java spring as fast as possible.");
		System.out.println();
		System.out.println("Motives: Have a little by little plan for algorithm..\n\n");
		System.out.println("Competitive Fire...");
		p2.set(20,2,2020,60);
		p2.find_ending_date();
		p2.days_passed();
		p2.time_remains();
		System.out.println();
		System.out.println();
		
	}
}
