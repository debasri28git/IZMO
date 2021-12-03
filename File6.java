package file;
import java.io.*;
import java.util.Scanner;
public class File6 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException
	{
Scanner sc=new Scanner(System.in);
System.out.println("enter roll");
int id=sc.nextInt();
System.out.println("enter name");
String str=sc.next();
System.out.println("enter age");
int age=sc.nextInt();
System.out.println("enter marks");
double d=sc.nextDouble();
Student s=new Student(id,str,age,d);
writeObject(s);
readObject();
}
static void  readObject() throws FileNotFoundException, IOException, ClassNotFoundException {//de-serializing
	ObjectInputStream oi=new ObjectInputStream(new FileInputStream("D:\\IZMO\\java\\A\\stud.txt"));
	//Student s=(Student)oi.readObject();
	System.out.println(oi.readObject());
	oi.close();
	}
	
	static void writeObject(Student s)throws FileNotFoundException, IOException //serializing
	{
		ObjectOutputStream ot=new ObjectOutputStream(new FileOutputStream("D:\\IZMO\\java\\A\\stud.txt"));
		ot.writeObject(s);	
		ot.close();
	}
}
