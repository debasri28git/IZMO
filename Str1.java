package javaBasic;

public class Str1 {

	public static void main(String[] args) {
		// String methods
		
		String s="hello this is java world";
		
		System.out.println("length "+s.length());
		
		String n1= new String();
		System.out.println(n1.hashCode());
		
		System.out.println("character at a particular position: "+s.charAt(2));
		
		System.out.println("position of a given character: "+s.indexOf('w'));

		System.out.println("position of a given string: "+s.indexOf("is"));
		
		System.out.println("last position of a given character: "+s.lastIndexOf('l'));
		
		System.out.println("last position of a given character: "+s.lastIndexOf("is"));
		
		System.out.println("part of a string from a starting index"+s.substring(8));
		
		System.out.println("part of a string from a starting index to endindex"+s.substring(8,12));
		
		System.out.println("starting unicode value of a particular position"+"A".codePointAt(0));
		
		System.out.println("compare to string --if both equal return 0,if invoke string id=s bigger return 1 if invoked string is smaller return -1"
		                    +"B".compareTo("A"));
		
		
		System.out.println("truncate spaces from first & last"+s.trim());
		
		System.out.println("convert to lower case"+s.toLowerCase());
		
		System.out.println("convert to uper case"+s.toUpperCase());
	
	// form a character array
		
		char ch[]=s.toCharArray();
	
//form a string array based on the delimiter
		String ss[]=s.split(" ");

		System.out.println("replace source char with targer char"+s.replace('o','O'));
		
		System.out.println("replace source string with targer string"+s.replace("o","X"));
		
		
	
	}
	
	
	

}
