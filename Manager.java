import java.util.Scanner;
class Manager
{
	public static void main(String ar[])
	{
		Employe e = new Employe();
		e.display();
		e.sub();
	}
}
class Employe extends Manager
{
	String a;
	int g;
	int s;
	String b;
	int h;
	int t;
	void display()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("For Manager");

	System.out.println("Enter your name:");
	a = sc.next();
	System.out.println("Enter your age");
	g = sc.nextInt();
	System.out.println("Enter your salary:");
	s = sc.nextInt();
	System.out.println("For Employe");

	System.out.println("Enter your name:");
	b = sc.next();
	System.out.println("Enter your age");
	h = sc.nextInt();
	System.out.println("Enter your salary:");
	t = sc.nextInt();
	}
	void sub()
	{
		System.out.println("Manager's information is as below:");
		System.out.println("Name:" + a);
		System.out.println("Age:" + g);
		System.out.println("Salary:" + s);.
		System.out.println("Employe's information is as below:");
		System.out.println("Name:" + b);
		System.out.println("Age:" + h);
		System.out.println("Salary:" + t);
	}
}