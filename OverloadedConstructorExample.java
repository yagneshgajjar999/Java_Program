class OverloadedConstructorExample
{
	int value;
	String name;
	
	OverloadedConstructorExample()
	{
		this.value=0;
		this.name="Default";
	}
	OverloadedConstructorExample(int value)
	{
		this.value=value;
		this.name="Default";
	}
	OverloadedConstructorExample(int value,String name)
	{
		this.value=value;
		this.name=name;
	}
	public void display()
	{
		System.out.println("Value:"+value);
		System.out.println("Name:"+name);
	}
	public static void main(String args[])
	{
		OverloadedConstructorExample ob1 = new OverloadedConstructorExample();
		OverloadedConstructorExample ob2 = new OverloadedConstructorExample(50);
		OverloadedConstructorExample ob3 = new OverloadedConstructorExample(75,"Java");
		ob1.display();
		ob2.display();
		ob3.display();
	}
}