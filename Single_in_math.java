import java.util.Scanner;
	
class sum
{
	void sumation(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
}
class sub extends sum
{
	void subtraction(int a, int b, int c)
	{
		System.out.println(a-b-c);
	}
}
class mul extends sub
{
	void multi(int a, int b, int c)
	{
		System.out.println(a*b*c);
	}
}
class Single_in_math
{
	static int a,b,c;
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a: ");
		a = sc.nextInt();
		System.out.println("Enter b: ");
		b = sc.nextInt();
		System.out.println("Enter c: ");
		c = sc.nextInt();
		
		mul m = new mul();
		m.sumation(a,b,c);
		m.subtraction(a,b,c);
		m.multi(a,b,c);
	}
	
}