package dt;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Scanner;
import java.util.Date;
public class Dt3 {

	public static void main(String[] args) {
		// java 8 date 
		Scanner sc=new Scanner(System.in);
		LocalDate ld=LocalDate.now();
		System.out.println(ld);
		System.out.println(ld.getMonth());
		System.out.println(ld.getYear());
		System.out.println(ld.getDayOfWeek());
		
		LocalDate ld1=ld.plusDays(12);
		System.out.println(ld1);
		ld1=ld.minusDays(12);
		System.out.println(ld1);
		ld1=ld.plusMonths(2);
		System.out.println(ld1);
		ld1=ld.minusMonths(2);
		System.out.println(ld1);
		ld1=ld.plusYears(2);
		System.out.println(ld1);
		ld1=ld.minusYears(2);
		System.out.println(ld1);
	System.out.println(ld.compareTo(ld1));
	String sd=ld.format(DateTimeFormatter.ofPattern("E dd L yyyy"));	
		System.out.println(sd);
		System.out.println("enter a date");
		String str=sc.nextLine();
		LocalDate lld=LocalDate.parse(str,DateTimeFormatter.ofPattern("EEE dd LLL yyyy"));
		System.out.println(lld);
		
		System.out.println(lld.isLeapYear());
	}

}
