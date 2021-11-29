package col;
import java.util.*;

public class User {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Book>bk=new ArrayList<>();
		bk.add(new Book(107,"html",480.00));
		bk.add(new Book(108,"sql",600.00));
		bk.add(new Book(105,"html",480.00));
		bk.add(new Book(106,"sql",600.00));
		bk.add(new Book(101,"java",780.00));
		bk.add(new Book(102,"oracle",980.00));
		bk.add(new Book(103,"html",480.00));
		bk.add(new Book(104,"sql",600.00));
		
		System.out.println("enter id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter name");
		String nm=sc.nextLine();
		System.out.println("enter price");
		double d=sc.nextDouble();
				Book b=new Book(id,nm,d);
		bk.add(b);
	//unsorted list
		System.out.println(bk);
	//sort by price using comparable	
	//	Collections.sort(bk);
	Collections.sort(bk,new Comparator_Price());	
		System.out.println(bk);
		//sort by id
/*Collections.sort(bk,new Comparator_Id());
		System.out.println(bk);
		//sort by name		
Collections.sort(bk,new Comparator_name());	
	System.out.println(bk);
	*/
	}

}
