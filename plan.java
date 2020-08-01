import java.util.Calendar;
class plan{
	long s_millis;
	long e_millis;
	Calendar c;
	plan(){
		s_millis = 0;
		e_millis = 0;
		c = null;
	}
	void set(int d,int m,int y,long period){
		System.out.println("Starting Date is : "+String.format("%d/0%d/%d at 00:00",d,m,y));
		c = Calendar.getInstance();
		c.set(y,m-1,d,0,0);
		c.set(c.SECOND,0);///lets see if i need seconds to be 0 or not here
		s_millis = c.getTimeInMillis();///this will change according to set date long x is time period from a set date....
		period = period*24*60*60*1000;
		e_millis = period + s_millis - 1000;
	}
	void find_ending_date(){
		c.setTimeInMillis(e_millis);
		System.out.println("Ending Date: "+c.getTime());
	}
	void time_remains(){
		c = Calendar.getInstance();
		c.set(c.HOUR_OF_DAY,(c.get(c.HOUR_OF_DAY)-12));///IF I USE c.roll(c.HOUR,12); it goes back to ///roll wont change the date
		c.set(c.get(c.YEAR),c.get(c.MONTH),c.get(c.DATE),c.get(c.HOUR_OF_DAY),c.get(c.MINUTE));
		long millis = c.getTimeInMillis();////getting current time in millis and it will increase according to the time...
		millis = e_millis - millis;
		long days = millis/(24*60*60*1000);
		double  hours = (double)millis/(60*60*1000) - (24.00*(millis/(24*60*60*1000)));
		double minits = (double)millis/(60*1000) - (60.00 *(millis/(60*60*1000)));
		double seconds = (double)millis/1000 - (60.00 *(millis/(60*1000)));
		System.out.println("Time Remains: "+days+" days "+(long)hours+" hours "+(long)minits+" minits "+(long)seconds+" seconds");
	}
	void days_passed(){
		c = Calendar.getInstance();
		c.set(c.HOUR_OF_DAY,(c.get(c.HOUR_OF_DAY)-12));///IF I USE c.roll(c.HOUR,12); it goes back to ///roll wont change the date
		c.set(c.get(c.YEAR),c.get(c.MONTH),c.get(c.DATE),c.get(c.HOUR_OF_DAY),c.get(c.MINUTE));
		long millis = c.getTimeInMillis();
		millis = millis - s_millis;
		long days = millis/(24*60*60*1000);
		double  hours = (double)millis/(60*60*1000) - (24.00*(millis/(24*60*60*1000)));
		double minits = (double)millis/(60*1000) - (60.00 *(millis/(60*60*1000)));
		double seconds = (double)millis/1000 - (60.00 *(millis/(60*1000)));
		System.out.println("Time passed: "+days+" days "+(long)hours+" hours "+(long)minits+" minits "+(long)seconds+" seconds");
	}
}
