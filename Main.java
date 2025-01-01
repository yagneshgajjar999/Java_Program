class input
{
	int a = 10;
	int b = 5;
}
class addition extends input
{
	
	void add()
	{
		System.out.println(a+b);
	}
}
class subtraction extends input
{
	void sub()
	{
		System.out.println(a-b);
	}
}
class multiplication extends input
{
	void multi()
	{
		System.out.println(a*b);
	}
}
class Main
{
	public static void main(String ar[])
	{
		multiplication m=new multiplication();
		subtraction s=new subtraction();
		addition a=new addition();
		a.add();
		s.sub();
		m.multi();
	}
}
