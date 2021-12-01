package dt;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateDemo4 {

	public static void parseLocalDate()
	{//String to LocalDate
		String date="2020-02-26";
	LocalDate ld=LocalDate.parse(date);//Iso_Local_Date	
	System.out.println(ld);	
	
	String date1="20200420";//yyyyMMdd
	LocalDate ld1=LocalDate.parse(date1, DateTimeFormatter.BASIC_ISO_DATE);
	System.out.println(ld1);	
	//custom date
	String date2="2021.17.08";
	DateTimeFormatter dt=DateTimeFormatter.ofPattern("yyyy.dd.MM");
	LocalDate ld2=LocalDate.parse(date2,dt);
	System.out.println(ld2);
	}
	
	
	
	public static void formatLocalDate()
	{// LocalDate to string
 		
	LocalDate ld=LocalDate.now();	
		
	DateTimeFormatter dt=DateTimeFormatter.ofPattern("dd/MM/yyyy");
	String date=ld.format(dt);
	System.out.println(ld);
	System.out.println(date);
	
	//d MMM uuuu
	DateTimeFormatter d=DateTimeFormatter.ofPattern("d MMM uuuu");
	String dt1=ld.format(d);
	System.out.println(dt1);
	//Tue, 3 Nov 2008
	DateTimeFormatter d1=DateTimeFormatter.ofPattern("E,d MMM uuuu");
	String dt2=ld.format(d1);
	System.out.println(dt2);
	}
	
	public static void parseLocalTime()
	{
	String time="13:00";
	LocalTime lt=LocalTime.parse(time);
	System.out.println(lt);
	//custom time
	String time1="21.45.34";
	DateTimeFormatter dt=DateTimeFormatter.ofPattern("HH.mm.ss");
	LocalTime lt1=LocalTime.parse(time1,dt);
	System.out.println(lt1);
	
	}
	
	public static void formatLocalTime()
	{
		DateTimeFormatter dt=DateTimeFormatter.ofPattern("HH.mm.ss");
		LocalTime t=LocalTime.now();
		String time=t.format(dt);
		System.out.println(t);
        System.out.println(time);
        
	}
	
	
	
	public static void main(String[] args) {
		//converting string to LocalDate , LocalTime and vice versa
		parseLocalDate();
		formatLocalDate();
		parseLocalTime();
		formatLocalTime();

	}

}
