class one 
{
	int a = 10,b = 20;
	void data()
	{
		System.out.println("Data method call");
	}
}
class two extends one 
{
	void display()
	{
		System.out.println(a+b);
	}
}
class single_in
{
	public static void main(String ar[])
	{
		two t= new two();
		t.display();
		t.data();
	}
}