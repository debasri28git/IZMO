package file;

import java.io.Serializable;

public class Student implements Serializable{

	int roll;
	String name;
	transient int age;
	double marks;
	public Student(int roll, String name, int age, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
	}


	
}
