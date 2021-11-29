package col;
import java.util.*;
public class Demo_Set {

	public static void main(String[] args) {
		HashSet<Integer>s1=new HashSet<>();
		s1.add(12);
		s1.add(30);
		s1.add(8);
		s1.add(24);
		s1.add(30);
		s1.add(8);
		System.out.println(s1);
		s1.add(null);
		System.out.println(s1);
		//s1.
		LinkedHashSet<Integer>s2=new LinkedHashSet<>();
		s2.add(12);
		s2.add(30);
		s2.add(8);
		s2.add(24);
		s2.add(null);
		s2.add(12);
		s2.add(null);
		System.out.println(s2);
		
	TreeSet<Integer>s3=new TreeSet<>();
		s3.add(12);
		s3.add(30);
		s3.add(8);
		s3.add(24);
		//s3.add(null);
		s3.add(12);
		//s3.add(null);
		System.out.println(s3);
	Iterator i=s3.descendingIterator();	
	while(i.hasNext())
		System.out.println(i.next());

	}

}
