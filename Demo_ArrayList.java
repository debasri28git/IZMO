package col;
import java.util.*;

public class Demo_ArrayList {

	public static void main(String[] args) {
		List <Object>l=new ArrayList();//generic syntax
		List <Integer>l1=new ArrayList<>();//specific for integer
		ArrayList <Integer>l2=new ArrayList<>();//size is optional
		l2.ensureCapacity(6);
		//System.out.println(getArrayList().capacity(l2));
		System.out.println(l2);
		System.out.println(l2.size());
		l2.add(12);l2.add(56);l2.add(78);l2.add(17);l2.add(92);l2.add(22);
		System.out.println(l2.size());
		System.out.println(l2);
		l.add(100);
		l.add("java");
		l.add(23.34);
		//String n=(String)l.get(0);
		//System.out.println(n);
		System.out.println(l);
		System.out.println(l2.get(3));
		System.out.println(l2.contains(78));
		System.out.println(l2.remove(3));
		System.out.println(l2);
		l1.add(100);l1.add(200);l1.add(300);
		l2.addAll(l1);
		System.out.println(l2);
		l2.removeAll(l1);
		System.out.println(l2);
		//printing
		//1
		for(int x:l2)
			System.out.print(x+"\t");
		System.out.println();
		//2
		for(int i=0;i<l2.size();i++)
			System.out.print(l2.get(i)+"\t");
		//3
		System.out.println();
		Iterator i=l2.iterator();
		
	while(i.hasNext())
		{
			System.out.print(i.next()+"\t");//return type of next is Object type
		}
		
	System.out.println();
	for(Object x:l)
		System.out.print(x+"\t");
	System.out.println();
	//2
	for(int j=0;j<l.size();j++)
		System.out.print(l.get(j)+"\t");
	//3
	System.out.println();
	Iterator ii=l.iterator();
	
while(ii.hasNext())
	{
		System.out.print(ii.next()+"\t");//return type of next is Object type
	}
	
	//Vector v=new Vector(5);
	
	//System.out.println(v.capacity());
	}

	
}
