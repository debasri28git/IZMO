package dt;
import java.util.Date;
import java.util.Calendar;
public class Dt1 {

	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d);
		/*
		 * System.out.println(d.getDate()); System.out.println(d.getDay());
		 * System.out.println(d.getHours()); System.out.println(d.getMinutes());
		 * System.out.println(d.getMonth()); System.out.println(d.getSeconds());
		 */
		
	Calendar c=Calendar.getInstance();
	System.out.println(c.get(Calendar.DATE));
	System.out.println(c.get(Calendar.HOUR));
	System.out.println(c.get(Calendar.MINUTE));
	System.out.println(c.get(Calendar.MONTH));
	System.out.println(c.get(Calendar.YEAR));
	System.out.println(c.get(Calendar.DAY_OF_WEEK));
		/*
		 * System.out.println(c.get(Calendar.MONDAY));
		 * System.out.println(c.get(Calendar.SATURDAY));
		 * System.out.println(c.get(Calendar.SUNDAY));
		 * System.out.println(c.get(Calendar.THURSDAY));
		 * System.out.println(c.get(Calendar.TUESDAY));
		 * System.out.println(c.get(Calendar.WEDNESDAY));
		 * System.out.println(Calendar.FRIDAY);
		 */
	
	}

}
