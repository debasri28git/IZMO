package dt;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Dt2 {

	public static void main(String[] args) throws ParseException {
		
		//String pat="dd-MM-YYYY";
		String pat2="EEEEE MMMMM dd yyyy";
		
		SimpleDateFormat smt=new SimpleDateFormat(pat2);
		//smt.format(date)--convert date to string
        //  smt.parse(string)--convert string to date throws parse exception
		
		Date d=new Date();
		String dt=smt.format(d);
		System.out.println(dt);
		System.out.println("enter date[dd-mm-yy]");
		Scanner sc=new Scanner(System.in);
		String dt1=sc.nextLine();
		SimpleDateFormat smt1=new SimpleDateFormat("dd-MM-yy");
		Date d1=smt1.parse(dt1);
		System.out.println(d1);
		
		/*Pattern	Example
dd-MM-yy	31-01-12
dd-MM-yyyy	31-01-2012
MM-dd-yyyy	01-31-2012
yyyy-MM-dd	2012-01-31
yyyy-MM-dd HH:mm:ss	2012-01-31 23:59:59
yyyy-MM-dd HH:mm:ss.SSS	2012-01-31 23:59:59.999
yyyy-MM-dd HH:mm:ss.SSSZ	2012-01-31 23:59:59.999+0100
EEEEE MMMMM yyyy HH:mm:ss.SSSZ	Saturday November 2012 10:45:42.720+0100
*/
		
		
	}

}
