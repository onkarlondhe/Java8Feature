package com.datetimedemo;
import java.time.*;

public class DateTimeDemo {

	public static void main(String[] args) {
		 
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("LocalDateTime is : "+ldt);
		
		LocalDate ld = LocalDate.now();
		System.out.println("LocalDate is : "+ld);
		
		LocalTime lt = LocalTime.now();
		System.out.println("LocalTime is : "+lt);
		
		MonthDay md = MonthDay.now();
		System.out.println("MonthDay is : "+md);
		
		Year y = Year.now();
		System.out.println("Year is : "+y);
		
		YearMonth ym = YearMonth.now();
		System.out.println("YearMonth is : "+ym);
		
		OffsetTime ost = OffsetTime.now(); 
		System.out.println("OffsetTime is : "+ost);
		
		OffsetDateTime osdt = OffsetDateTime.now();
		System.out.println("OffsetDateTime is : "+osdt);
		
		Period p = Period.ofDays(2);
		System.out.println("Period is : "+p);
		
//		Duration d = Duration.
				
//		Clock c = Clock.
		
		




		

	}

}
