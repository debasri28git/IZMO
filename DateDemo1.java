package dt;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class DateDemo1 {

	public static void main(String[] args) {
	      LocalDate ld=LocalDate.now();
		  System.out.println(ld);
		
		 LocalDate ld1=LocalDate.of(2021,11,10);
		System.out.println(ld1);
		LocalDate ld3=LocalDate.ofYearDay(2018,1);//ofYearDay(2018,365)
		/*System.out.println(ld3);
		System.out.println(ld.getDayOfMonth());
		System.out.println(ld.getDayOfYear());
		System.out.println(ld.getMonthValue());
		System.out.println(ld.getYear());
		System.out.println(ld.isLeapYear());
		System.out.println(ld.getDayOfWeek());
		System.out.println(ld.plusDays(12));
		System.out.println(ld.plusMonths(3));
		System.out.println(ld.plusYears(2));
		System.out.println(ld.minusDays(4));
		System.out.println(ld.minusMonths(4));
		System.out.println(ld.minusYears(3));
		
		System.out.println(ld.get(ChronoField.DAY_OF_MONTH));
		System.out.println(ld.get(ChronoField.DAY_OF_WEEK));
		System.out.println(ld.get(ChronoField.DAY_OF_YEAR));
		System.out.println(ld.withYear(2045));
		System.out.println(ld.withMonth(12));
		System.out.println(ld.withDayOfYear(156));
		System.out.println(ld.withDayOfMonth(23));
		
		System.out.println(ld.with(TemporalAdjusters.firstDayOfMonth()));
		System.out.println(ld.with(TemporalAdjusters.firstDayOfNextMonth()));
		System.out.println(ld.with(TemporalAdjusters.lastDayOfYear()));
		
		System.out.println(ld.with(TemporalAdjusters.next(DayOfWeek.MONDAY)));
		System.out.println(ld.with(TemporalAdjusters.next(DayOfWeek.SUNDAY)));
		System.out.println(ld.with(TemporalAdjusters.previous(DayOfWeek.SATURDAY)));
		*/
		System.out.println(ld.isEqual(ld1));
		System.out.println(ld.isAfter(ld1));
		System.out.println(ld.isBefore(ld1));
		
		
	}

}
