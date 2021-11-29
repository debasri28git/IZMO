package col;

import java.util.Comparator;

public class Book  
{
int id;
String name;
double price;
public Book(int id, String name, double price) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
}
@Override
public String toString() {
	return "Book [id=" + id + ", name=" + name + ", price=" + price + "]";
}

}
 class Comparator_Id implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
if(o1.id>o2.id)
	return 1;
else if(o1.id<o2.id)
return -1;

return 0;
	}

}
 
 class Comparator_name implements Comparator<Book>{

		@Override
		public int compare(Book o1, Book o2) {

	return o1.name.compareTo(o2.name);

		
		}

}
 class Comparator_Price implements Comparator<Book>{

		@Override
		public int compare(Book o1, Book o2) {
      
			if(o1.price==o2.price)
			{
				if(o1.id>o2.id)
					return 1;
				else if(o1.id<o2.id)
				return -1;
				else
				return 0;	
				
			}	//return o1.id-o2.id;
			else if(o1.price>o2.price)
				return 1;
			else return -1;
				//return (int)(o1.price - o2.price);
			
			
		}

}

