package col;

import java.util.*;
public class Demo_Map {
public static void main(String[] args) {
  
	HashMap<Integer,String>hp=new HashMap<>();
	
	hp.put(10,"java");
	hp.put(12,"sql");
	hp.put(11,"html");
	hp.put(14,"oracle");
	hp.put(10,"sql");
	hp.put(null,null);
	hp.put(null,null);
	hp.put(17,null);
	hp.put(18,null);
//1 way only in jdk 8
	hp.forEach((x,y)->System.out.println(x+" "+y));
//1.5	
System.out.println(hp);	
//2
	Set <Integer>s=hp.keySet();
Iterator i=s.iterator();
while(i.hasNext())
{
Integer k=(Integer)i.next();
System.out.println("key: "+k+"   value: "+hp.get(k));
}
//3 using EntrySet
for(Map.Entry<Integer,String>hm:hp.entrySet())
{
System.out.println("key: "+hm.getKey()+"   value:"+hm.getValue());	
}

LinkedHashMap<Integer,String>lhp=new LinkedHashMap<>();

lhp.put(10,"java");
lhp.put(12,"sql");
lhp.put(11,"html");
lhp.put(14,"oracle");
lhp.put(10,"sql");
lhp.put(null,null);
lhp.put(null,null);
lhp.put(17,null);
lhp.put(18,null);
System.out.println(lhp);

TreeMap<Integer,String>tm=new TreeMap<>();

tm.put(10,"java");
tm.put(12,"sql");
tm.put(11,"html");
tm.put(14,"oracle");
tm.put(10,"sql");
//tm.put(null,null);
//tm.put(null,null);
tm.put(17,null);
tm.put(18,null);
System.out.println(tm);
}
}
