package midon.bbx.bbxapi.util;

public class CalendarCreator {

	public int[][] makeCalendar(int month, int year) {
		
		int monthNumber = month - 1;
		int firstDay = this.dayIndex(1, monthNumber, year);
		int daysInMonth = this.daysInMonth(monthNumber, year);
		int numberOfWeeks = this.weeksInMonth(monthNumber, year);
		int[][] weeks = new int [numberOfWeeks][7];
		
		int incr = 0;
		int day = 1;
		for(int i = 0; i < numberOfWeeks; i++) {
			for(int j = 0; j < 7; j++) {
				if(incr < firstDay)
					weeks[i][j] = 0;
				else if(day <= daysInMonth) {
					weeks[i][j] = day;
					day++;
				}
				incr++;
			}
		}
		return weeks;
	}
	
	/*
	  Returns the index of the day for a given date... 
	  Index     Day
	  -----		--------- 
	  0         Sunday 
	  1         Monday 
	  2         Tuesday 
	  3         Wednesday 
	  4         Thursday 
	  5         Friday 
	  6         Saturday
	*/
	private int dayIndex(int day, int monthNumber, int year) { 
	    int[] t = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
	    if(monthNumber < 2)
	    	year -= 1;
	    return (year + year/4 - year/100 + year/400 + t[monthNumber] + day) % 7;
	} 
	
	/* 
	  Returns the name of the month with a given month number... 
	  Month Number     Name
	  ------------	   -------- 
	  0                January 
	  1                February 
	  2                March 
	  3                April 
	  4                May 
	  5                June 
	  6                July 
	  7                August 
	  8                September 
	  9                October 
	  10               November 
	  11               December 
	*/
	public String monthName(int monthNumber) { 
	    String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}; 
	    return months[monthNumber]; 
	} 
	  
	/* 
	  Returns the number of days in a month 
	  Month Number     Name        Number of Days
	  ------------	   --------    --------------
	  0                January     31 
	  1                February    28 (non-leap) / 29 (leap) 
	  2                March       31 
	  3                April       30 
	  4                May         31 
	  5                June        30 
	  6                July        31 
	  7                August      31 
	  8                September   30 
	  9                October     31 
	  10               November    30 
	  11               December    31 
	*/
	private int daysInMonth(int monthNumber, int year) { 
	    // January 
	    if (monthNumber == 0) 
	        return 31; 
	  
	    // February 
	    if (monthNumber == 1) { 
	        // if the year is leap then February has 29 days 
	        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) 
	            return 29; 
	        else
	            return 28; 
	    } 
	  
	    // March 
	    if (monthNumber == 2) 
	        return 31; 
	  
	    // April 
	    if (monthNumber == 3) 
	        return 30; 
	  
	    // May 
	    if (monthNumber == 4) 
	        return 31; 
	  
	    // June 
	    if (monthNumber == 5) 
	        return 30; 
	  
	    // July 
	    if (monthNumber == 6) 
	        return 31; 
	  
	    // August 
	    if (monthNumber == 7) 
	        return 31; 
	  
	    // September 
	    if (monthNumber == 8) 
	        return 30; 
	  
	    // October 
	    if (monthNumber == 9) 
	        return 31; 
	  
	    // November 
	    if (monthNumber == 10) 
	        return 30; 
	  
	    // December 
	    if (monthNumber == 11) 
	        return 31;
	    
	    return 0;
	} 
	
	private int weeksInMonth(int monthNumber, int year) {

		int firstDay = this.dayIndex(1, monthNumber, year);
		int numberOfDays = this.daysInMonth(monthNumber, year);
		int daySum = 7 - firstDay;
		int weeks = 1;
		
		boolean done = false;
		while(!done) {
			daySum += 7;
			if(daySum >= numberOfDays)
				done = true;
			weeks++;
		}
		return weeks;
	}
}
