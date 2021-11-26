package col;
import java.util.*;
public class Demo_LinkedList {

	public static void main(String[] args) {
LinkedList <String>name=new LinkedList<>();
name.add("nayana");
name.add("sumeet");
name.add("puneet");
name.add("anu");
name.add("sachin");
name.add("rajesh");
name.add("pavan");
name.add("jitendra");
LinkedList <String>name1=new LinkedList<>();
name1.add("hema");
name1.add("ram");
name1.add("nayana");
name1.add("kavya");
name1.add("nayana");
name1.add("vishes");
name1.add("vyshnavi");
name.addAll(name1);
System.out.println(name.contains("nayana"));
System.out.println(name.getFirst());
System.out.println(name.getLast());
System.out.println(name.indexOf("nayana"));
System.out.println(name.lastIndexOf("nayana"));
System.out.println(name.remove(0));
System.out.println(name);
System.out.println(name.remove("sumeet"));
System.out.println(name);
System.out.println(name.removeFirst());
System.out.println(name);
System.out.println(name.removeLast());
System.out.println(name);
System.out.println(name.removeFirstOccurrence("nayana"));
System.out.println(name.removeLastOccurrence("nayana"));
name.addLast("vikaas");
System.out.println(name);
name.addFirst("ram");




	}

}
