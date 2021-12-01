package dt;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
public class DateDemo3 {

	public static void main(String[] args) {
		/*Date to local date and vice versa*/
	Date date=new Date();	
	System.out.println(date);
LocalDate l=date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	System.out.println(l);

	
/* LocalDate to Date */	
	
	
	Date dt=
	Date.from(l.atTime(LocalTime.now()).atZone(ZoneId.systemDefault()).toInstant());
	System.out.println(dt);
	
	}

}
