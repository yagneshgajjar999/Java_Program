import java.util.Scanner;
class input
{
	
	int a = 10;
	int b = 20;
	int c = 30;
	
	void gate()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your Number a:");
		a=sc.nextInt();
		System.out.println("Enter your Number b:");
		b=sc.nextInt();
		System.out.println("Enter your Number c:");
		c=sc.nextInt();
	}
}
class addition extends input
{
	void add()
	{
		System.out.println(a+b+c);
	}
}
class subtraction extends input
{
	void sub()
	{
		System.out.println(a-b-c);
	}
}
class multiplication extends input
{
	void multi()
	{
		System.out.println(a*b*c);
	}
}
class Main1
{
	public static void main(String ar[])
	{
		addition a=new addition();
		a.add();
		subtraction s=new subtraction();
		s.sub();
		multiplication m=new multiplication();
		m.multi();
	}
}
