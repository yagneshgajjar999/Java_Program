import java.util.Scanner;
class Exception
{
	public static void main(String ar[])
	{
		Exc e = new Exc();
		e.display();
		e.vip();
	}
}
class Exc extends Exception
{
	int a,b,c;
	void display()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number a:" + a);
		a = sc.nextInt();
		System.out.println("Enter Second number b:" + b);
		b = sc.nextInt();
	}
	void vip()
	{
	try
	{
		c = a/b;
		System.out.println("Div:" + c);
	}
	catch(ArithmeticException e)
	{
		System.out.println("Can't Divide by zero");
	}
	}
}