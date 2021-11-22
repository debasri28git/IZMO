package javaBasic;

import java.util.Scanner;

public class Client2 {

	public static void main(String[] args) {

		Employee emp[] = new Employee[100];

		int size = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("**********************\n1) Add employee \n2)Display All Employee\n3)Find Employee by id\n4)exit\n********************");
			String op = sc.next();

			switch (op) {
			case "1": {

				System.out.println("enter id");
				int id = sc.nextInt();
				System.out.println("enter name");
				sc.nextLine();
				String nm = sc.nextLine();
				System.out.println("enter salary");
				double salary = sc.nextDouble();
				Employee e = new Employee();
				e.setId(id);
				e.setName(nm);
				e.setSalary(salary);
				emp[size++] = e;
				System.out.println("! record inserted");
				break;
			}
			case "2": {
				if (size == 0) {
					System.out.println("no record found!");
					break;
				} else {
					for(int i=0;i<size;i++)
						System.out.println(emp[i].getId() + "  " + emp[i].getName() + " " + emp[i].getSalary());
					break;
				}
			}
			case "3":{
				
				boolean f=false;
				if (size == 0) {
					System.out.println("no record found!");
					break;
				} else {
					System.out.println("enter id");
					int eid=sc.nextInt();
					for (int i=0;i<size;i++)
						
						if(emp[i].getId()==eid)
						{System.out.println(emp[i].getId() + "  " + emp[i].getName() + " " + emp[i].getSalary());
						f=true;
						break;
						}
					if(f==false)
						System.out.println("no record found!!");
					break;
				}
				
			}
			case "4":{System.exit(0);break;}
			default:System.out.println("invalid option try again");
			}

		} while (true);

	}

}
